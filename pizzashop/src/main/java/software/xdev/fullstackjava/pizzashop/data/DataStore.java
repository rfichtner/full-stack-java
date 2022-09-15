
package software.xdev.fullstackjava.pizzashop.data;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;
import software.xdev.fullstackjava.pizzashop.domain.Pizza;


public class DataStore
{
	
	public static final List<Pizza> pizzas = new ArrayList<>();

	// Initialize a storage manager ("the database") with purely defaults.
	public static final EmbeddedStorageManager storage =
		EmbeddedStorage.start(DataStore.pizzas, Path.of("my.database"));

}
