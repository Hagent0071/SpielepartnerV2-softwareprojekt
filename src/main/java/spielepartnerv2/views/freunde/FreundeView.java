package spielepartnerv2.views.freunde;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;
import spielepartnerv2.views.MainLayout;

@PageTitle("Freunde")
@Route(value = "Freunde", layout = MainLayout.class)
@PermitAll
public class FreundeView extends Composite<VerticalLayout> {

    public FreundeView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
