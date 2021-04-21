package modifier_final;

//a class only could have one Parent class, but could have multiples interfaces
//This means "Notebook" is one of the Product
public class Notebook extends Product {
	// warranty in (days)
	public int warranty;

	// since name, price are repeated, using extension
	public Notebook(String name, int price, int warranty) {
		this.name = name;
		this.price = price;
//		super(name, price);
		this.warranty = warranty;
	}

	//final can be used in class, method, variable and object reference
	//method: means the method can't be override
	@Override
	public String desc() {
		String message = super.desc();
		return message + " Warranty:" + warranty + " Days";
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
