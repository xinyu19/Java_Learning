package modifier_abstract;

//a class only could have one Parent class, but could have multiples interfaces
//This means "Notebook" is one of the Product
public class Notebook extends Product {
	// warranty in (days)
	public int warranty;
	
	public Notebook() {}
	
	// since name, price are repeated, using extension
	public Notebook(String name, int price, int warranty) {
		this.name = name;
		this.price = price;

		this.warranty = warranty;
	}

	// override: child class can revise method from parent class
	// override parent class method, the name of method, reference type number, and
	// the return type should be the same
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

	//since we use abstract to declare the calculate() method, we need to implement it in the child class
	@Override
	public void calculate(int price) {
		System.out.println("this is an abstract, the price would be: " + price*0.9);;
		
	}

}
