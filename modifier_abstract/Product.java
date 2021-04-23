package modifier_abstract;

//once a class has any method is abstract, the class would be called "abstract class", 
//and need to add abstract before class
public abstract class Product {
	String name;
	int price;

	public String desc() {
		return "Brand： " + name + " Price ：" + price;
	}

	// abstract: it only define the method (name, reference, return), child class
	// will give how the method works
	public abstract void calculate(int price);

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
