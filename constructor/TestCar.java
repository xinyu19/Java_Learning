package constructor;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car('Y');
		System.out.println("Sold: " + car.getModel() + " Price: " + car.getPrice() + " Color: " + car.getColor());
		//Sold: Prius Price: 1099000 Color: Y
	}

}
