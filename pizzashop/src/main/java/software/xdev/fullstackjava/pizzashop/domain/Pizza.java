
package software.xdev.fullstackjava.pizzashop.domain;

public class Pizza
{

	// no "database id"

	private final String menuId;
	private final String name;
	private final int    calories;
	private final String desciption;

	public Pizza(final String menuId, final String name, final int calories, final String desciption)
	{
		super();
		this.menuId     = menuId;
		this.name       = name;
		this.calories   = calories;
		this.desciption = desciption;
	}

	public String getName()
	{
		return this.name;
	}

	public int getCalories()
	{
		return this.calories;
	}

	public String getMenuId()
	{
		return this.menuId;
	}

	public String getDesciption()
	{
		return this.desciption;
	}

	@Override
	public String toString()
	{
		return "Pizza [menuId=" + this.menuId + ", name=" + this.name + ", calories=" + this.calories + ", desciption="
			+ this.desciption
			+ "]";
	}

}
