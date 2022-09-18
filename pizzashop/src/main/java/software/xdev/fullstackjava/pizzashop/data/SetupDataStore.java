
package software.xdev.fullstackjava.pizzashop.data;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;
import software.xdev.fullstackjava.pizzashop.domain.Pizza;


public class SetupDataStore
{
	
	public static void main(final String[] args)
	{
		
		final List<Pizza> pizzas = new ArrayList<>();
		
		// Initialize a storage manager ("the database") with purely defaults.
		final EmbeddedStorageManager storage = EmbeddedStorage.start(pizzas, Path.of("my.database"));
		
		pizzas.stream().forEach(p -> System.out.println(p));

		if(pizzas.isEmpty())
		{
			pizzas.add(new Pizza("P 1", "Hawaiian", 2080, "The controversy"));
			pizzas.add(new Pizza("P 2", "Margherita", 2080, "Nice and easy"));
			pizzas.add(new Pizza("P 3", "Prosciutto e funghi", 2080, "It's e me Mario"));
			pizzas.add(new Pizza("P 4", "Quattro Formaggi", 2080, "All the cheese"));
			pizzas.add(new Pizza("P 5", "Pepperoni", 2080, "On a pizza?"));
			pizzas.add(new Pizza("P 6", "Ham and Cheese", 2080, "Ham with more Cheese"));
			pizzas.add(new Pizza("P 7", "Nacho", 2080, "Mexican Style"));
			storage.storeRoot();
			pizzas.stream().forEach(p -> System.out.println(p));
		}
		
		storage.shutdown();
		
	}
	
}
