package software.xdev.fullstackjava;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;

public class Start {

	public static void main(String[] args) {

		Map<LocalDateTime, Pizza> orders = new HashMap<>();

		// Initialize a storage manager ("the database") with purely defaults.
		final EmbeddedStorageManager storage = EmbeddedStorage.start(orders, Path.of("my.database"));

		orders.put(LocalDateTime.now(), new Pizza("Hawaii", 2080));

		storage.storeRoot();

		orders.forEach((time, pizza) -> System.out.println(time + " " + pizza));

		storage.shutdown();

	}

}
