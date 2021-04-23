package polymorphism;

public class Notebook extends Product {
	// warranty in (days)
	public int warranty;

	// since name, price are repeated, using extension
	public Notebook(String name, int price, int warranty) {
		super(name, price);
		this.warranty = warranty;
	}

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
