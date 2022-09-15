package software.xdev.fullstackjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Start {

	public static void main(String[] args) {

		Map<LocalDateTime, Pizza> orders = new HashMap<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("my.database"))) {
			orders = (Map<LocalDateTime, Pizza>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		orders.put(LocalDateTime.now(), new Pizza("Hawaii", 2080));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my.database"))) {
			oos.writeObject(orders);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		orders.forEach((time, pizza) -> System.out.println(time + " " + pizza));
		

	}

}
