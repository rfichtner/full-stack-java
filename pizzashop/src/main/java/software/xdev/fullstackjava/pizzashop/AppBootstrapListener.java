
package software.xdev.fullstackjava.pizzashop;

import org.jsoup.nodes.Element;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;


public class AppBootstrapListener implements VaadinServiceInitListener
{
	
	@Override
	public void serviceInit(final ServiceInitEvent event)
	{
		event.addBootstrapListener(response -> {
			final Element head = response.getDocument().head();
			head.append(
				"<link rel=\"shortcut icon\" href=\"frontend/images/favicon.ico\">");
		});
	}
}
