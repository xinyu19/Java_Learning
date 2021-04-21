package modifier_final;

public class Product {
	String name;
	int price;
	
	public String desc() {
		return "Brand： " + name + " Price ：" + price;
	}
	
	//final can be used in class, method, variable and object reference
	//class: means the class can't be inherit
	//method: means the method can't be override
	//variable: if final variable is assigned a value, it can't use "=" to assigned another value
	//object: can't assigned as other object
//	public final String desc() {
//		return "Brand： " + name + " Price ：" + price;
//	}

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
