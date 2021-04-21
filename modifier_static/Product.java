package modifier_static;

public class Product {
	//static final: usually define a constant, such as "pi". This way, will save some memory.
	//static block will only run one time when class is loaded in memory 
//	public static final double Tax = 0.101;
	public static final double TAX;
	static {
		TAX = 0.101;
		System.out.println("static block");
	}
	
	
	
	
	String name;
	int price;
	
	
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
