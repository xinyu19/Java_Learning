package inheritance;

public class Product {
	// name, price repeated
//	public String name;
//	public int price;
	// since Parent calss doesn't let other class to use the attributes
//	private String name;
//	private int price;

	// protected: only let child class to use the attributes
	protected String name;
	protected int price;

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
