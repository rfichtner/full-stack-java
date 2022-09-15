package software.xdev.fullstackjava;

import java.io.Serializable;

public class Pizza implements Serializable {

	private static final long serialVersionUID = 5379499148301172146L;

	// no "database id"
	private String name;
	private int calories;

	public Pizza(final String name, final int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", calories=" + calories + "]";
	}

}
