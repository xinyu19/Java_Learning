package encapsulation;

public class Car {
//    //before encapsulation
//	String model;
//  int price;

	/* 將property變成private,並產生public method */
	// if we change the property to private, other object cant direct get it, needs
	// to have a public method to get the data
	//instance variable for Car
	private String model;
	private int price;
	private char color;

	public String getModel() {
		return model;
	}

	// if the instance variable name is the same as local variable, then using
	// this.xxx for instance variable
	public void setModel(String model) {
		//this means current object, which means the memory address of current object	
		System.out.println(this.model);
		this.model = model;
		System.out.println(this.model);
		if (model.equalsIgnoreCase("Yaris")) {
			this.price = 575000;
		} else if (model.equalsIgnoreCase("Prius")) {
			this.price = 1099000;
		} else {
			System.out.println("錯誤的型號");
		}
	}

	public int getPrice() {
		//3 ways, but prefer the second one
		//return price;
		// return this.price;
		return Car.this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
