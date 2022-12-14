
package software.xdev.fullstackjava.pizzashop.ui;

import java.util.Arrays;
import java.util.Collection;

import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.ui.filter.FilterComponent;
import com.rapidclipse.framework.server.ui.filter.GridFilterSubjectFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;

import software.xdev.fullstackjava.pizzashop.HasTitle;
import software.xdev.fullstackjava.pizzashop.data.DataStore;
import software.xdev.fullstackjava.pizzashop.domain.Pizza;


@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout implements HasTitle
{
	public HomeView()
	{
		super();

		this.initUI();
		final PizzaDataProvider pdp = new PizzaDataProvider(DataStore.Instance.pizzas);
		this.grid.setDataProvider(pdp);
		this.filterComponent.connectWith(pdp);
	}
	
	@Override
	public String getTitle()
	{
		return "Home";
	}
	
	/**
	 * Event handler delegate method for the {@link Button} {@link #button}.
	 *
	 * @see ComponentEventListener#onComponentEvent(ComponentEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_onClick(final ClickEvent<Button> event)
	{
		
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.paragraph       = new Paragraph();
		this.button          = new Button();
		this.filterComponent = new FilterComponent();
		this.grid            = new Grid<>(Pizza.class, false);

		this.paragraph.setText(
			"This is the View that is shown at the root path. This could tell the user what this website has to offer.");
		this.button.setText("Click me");
		this.grid.addColumn(Pizza::getMenuId).setKey("menuId")
			.setHeader(CaptionUtils.resolveCaption(Pizza.class, "menuId"))
			.setSortable(true);
		this.grid.addColumn(Pizza::getName).setKey("name").setHeader(CaptionUtils.resolveCaption(Pizza.class, "name"))
			.setSortable(true);
		this.grid.addColumn(Pizza::getCalories).setKey("calories")
			.setHeader(CaptionUtils.resolveCaption(Pizza.class, "calories")).setSortable(true);
		this.grid.addColumn(Pizza::getDesciption).setKey("desciption")
			.setHeader(CaptionUtils.resolveCaption(Pizza.class, "desciption")).setSortable(true).setAutoWidth(true);
		this.grid.setSelectionMode(Grid.SelectionMode.SINGLE);

		this.filterComponent.connectWith(this.grid.getDataProvider());
		this.filterComponent.setFilterSubject(GridFilterSubjectFactory.CreateFilterSubject(this.grid,
			Arrays.asList("menuId", "name", "desciption"), Arrays.asList("menuId", "name", "calories", "desciption")));

		this.paragraph.setWidthFull();
		this.paragraph.setHeight(null);
		this.button.setSizeUndefined();
		this.filterComponent.setWidthFull();
		this.filterComponent.setHeight(null);
		this.grid.setSizeFull();
		this.add(this.paragraph, this.button, this.filterComponent, this.grid);
		this.setFlexGrow(1.0, this.grid);
		this.setSizeFull();

		this.button.addClickListener(this::button_onClick);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Button          button;
	private FilterComponent filterComponent;
	private Grid<Pizza>     grid;
	private Paragraph       paragraph;
	// </generated-code>
	
	class PizzaDataProvider extends ListDataProvider<Pizza>
	{
		
		public PizzaDataProvider(final Collection<Pizza> items)
		{
			super(items);
		}
		
	}
}
