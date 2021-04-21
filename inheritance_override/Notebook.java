package inheritance_override;

//a class only could have one Parent class, but could have multiples interfaces
//This means "Notebook" is one of the Product
public class Notebook extends Product {
	// warranty in (days)
	public int warranty;

	// since name, price are repeated, using extension
	public Notebook(String name, int price, int warranty) {
//		this.name = name;
//		this.price = price;

		// constructor in child class can call the constructor in parent class
		// super constructor must to be the first line
		// if there is no constructor in Parent class, compile will automatically create
		// "super();" -> not required to have it
		super(name, price);

		this.warranty = warranty;
	}

	// override: child class can revise method from parent class
	// override parent class method, the name of method, reference type number, and
	// the return type should be the same
	@Override
	// can't reduce the visibility of inherited method
	// if parent: protected -> child -> public / protected
//	private String desc() {
//	protected String desc() {
	public String desc() {
		// since we have the same "Brand： " + name + " Price： " + price" in our Parent
		// class
		// when using super to call the parent method, it is not required to be in the
		// first line
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
