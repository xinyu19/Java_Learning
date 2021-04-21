package inheritance;

//a class only could have one Parent class, but could have multiples interfaces
//This means "Notebook" is one of the Product
public class Notebook extends Product {
//	//name, price repeated
//	public String name;
//	public int price;

	// warranty in (days)
	public int warranty;

	// since name, price are repeated, using extension
	public Notebook(String name, int price, int warranty) {
		// Child class can use the attributes from Parent class
//		this.name = name;
//		this.price = price;
		
		//Protected: only its child class can inherit its attributes
		//if name price in Product changed its modifier to "protected", so we could use the followings
//		this.name = name;
//		this.price = price;
		
		// since name price in Product changed its modifier to "private", we can't inherit directly,
		// only through set/get to use it
		setName(name);
		setPrice(price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
