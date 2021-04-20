package constructor;

public class Car {
	/* 將property變成private,並產生public method */
	// if we change the property to private, other object cant direct get it, needs
	// to have a public method to get the data
	// instance variable for Car
	private String model;
	private int price;
	private char color;

	// constructor method, when we use new to call the constructor method, it will
	// automatically create this
	// Car car = new Car(); -> will make this as default
	// However, if we have Car car = new Car('W') -> it won't automatically crete
	// this default constructor
	public Car() {
	}

	public Car(char c) {
		// "this" only can call constructors' method
		// using "this" to call other constructors' method, needs to put in the first
		// line
		this("Prius", c);
	}

	public Car(String model, char color) {
		setModel(model);
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	// if the instance variable name is the same as local variable, then using
	// this.xxx for instance variable
	public void setModel(String model) {
		// this means current object, which means the memory address of current object
		this.model = model;
		if (model.equalsIgnoreCase("Yaris")) {
			this.price = 575000;
		} else if (model.equalsIgnoreCase("Prius")) {
			this.price = 1099000;
		} else {
			System.out.println("錯誤的型號");
		}
	}

	public int getPrice() {
		// 3 ways, but prefer the second one
		// return price;
		return this.price;
		// return Car.this.price;
	}

	public char getColor() {
		return color;
	}

	public void setcolor(char color) {
		this.color = color;
	}

}
