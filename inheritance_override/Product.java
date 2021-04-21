package inheritance_override;

public class Product {
	// protected: only let child class to use the attributes
	protected String name;
	protected int price;

	//Since the return type is String so we can only use "String" method
	// If we change the modifier to protected, the child class only can use protected
	// or public
//	protected String desc() {
	public String desc() {
		return "Brand： " + name + " Price ：" + price;
	}

	// using Source -> Generate constructor using field
	public Product() {

	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// using Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
