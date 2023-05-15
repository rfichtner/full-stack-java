
package software.xdev.fullstackjava.pizzashop.data;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;
import software.xdev.fullstackjava.pizzashop.domain.Pizza;


public class DataStore
{
	public static DataStore Instance = new DataStore();

	public List<Pizza> pizzas = new ArrayList<>();

	// Initialize a storage manager ("the database") with purely defaults.
	public EmbeddedStorageManager storage =
		EmbeddedStorage.start(this.pizzas, Path.of("my.database2"));

	public DataStore()
	{
		if(this.pizzas.isEmpty())
		{
			this.pizzas.add(new Pizza("P 1", "Hawaiian", 2080, "The controversy"));
			this.pizzas.add(new Pizza("P 2", "Margherita", 1000, "Nice and easy"));
			this.pizzas.add(new Pizza("P 3", "Prosciutto e funghi", 1890, "It's e me Mario"));
			this.pizzas.add(new Pizza("P 4", "Quattro Formaggi", 3000, "All the cheese"));
			this.pizzas.add(new Pizza("P 5", "Pepperoni", 2220, "On a pizza?"));
			this.pizzas.add(new Pizza("P 6", "Ham and Cheese", 2980, "Ham with more Cheese"));
			this.pizzas.add(new Pizza("P 7", "Nacho", 3100, "Mexican Style"));
			this.storage.storeRoot();
		}

	}

}
