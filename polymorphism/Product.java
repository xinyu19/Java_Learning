package polymorphism;

public class Product {
	protected String name;
	private int price;

	
	public String desc() {
		return "Item： " + name + " Price ：" + price;
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
