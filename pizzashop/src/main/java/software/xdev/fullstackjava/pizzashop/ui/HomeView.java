
package software.xdev.fullstackjava.pizzashop.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import software.xdev.fullstackjava.pizzashop.HasTitle;


@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout implements HasTitle
{
	public HomeView()
	{
		super();
		
		final Button myButton = new Button("Click Me!");
		this.add(myButton);
		
		myButton.addClickListener(e -> Notification.show("clicked"));

		this.initUI();
		
	}

	@Override
	public String getTitle()
	{
		return "Home";
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.setSizeFull();
	} // </generated-code>

}
