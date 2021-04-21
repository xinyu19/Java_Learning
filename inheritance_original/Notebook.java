package inheritance_original;

public class Notebook {
	public String name;
	public int price;
	// warranty in (days)
	public int warranty;

	public Notebook() {
	
	}
	
	public Notebook(String name, int price, int warranty) {
		this.name = name;
		this.price = price;
		this.warranty = warranty;
	}
	
	
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

	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
