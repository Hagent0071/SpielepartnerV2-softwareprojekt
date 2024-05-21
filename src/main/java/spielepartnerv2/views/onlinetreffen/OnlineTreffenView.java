package spielepartnerv2.views.onlinetreffen;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;
import spielepartnerv2.views.MainLayout;

@PageTitle("OnlineTreffen")
@Route(value = "OnlineTreffen", layout = MainLayout.class)
@PermitAll
public class OnlineTreffenView extends Composite<VerticalLayout> {

    public OnlineTreffenView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
