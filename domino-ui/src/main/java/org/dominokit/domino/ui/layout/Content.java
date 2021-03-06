package org.dominokit.domino.ui.layout;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.elemento.Elements.div;
import static org.jboss.elemento.Elements.section;

public class Content extends BaseDominoElement<HTMLElement, Content> {

    HTMLDivElement contentContainer;
    HTMLElement section;

    public Content() {
        contentContainer = div().css(LayoutStyles.CONTENT_PANEL).element();
        section = section()
                .css(LayoutStyles.CONTENT)
                .add(contentContainer)
                .element();
        init(this);
    }

    public static Content create(){
        return new Content();
    }

    @Override
    public HTMLElement element() {
        return section;
    }
}
