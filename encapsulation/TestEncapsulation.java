package encapsulation;
import func.People;

public class TestEncapsulation {
	public static void main(String[] args) {

		// the reason of using encapsulation: avoid some inappropriate other class
		// direct get its attributes

//    	//尚末封裝前: people can change the price
//    	Car car = new Car();
//      car.model = "Prius";
//      car.price = 100000;
//      System.out.println("售出"+car.model+"，"+car.price);

		// after encapsulation
		Car car = new Car();
		car.setModel("yaris");//null //yaris
		System.out.println("售出" + car.getModel() + "，" + car.getPrice());//售出yaris，575000
		
		car.setModel("Rav4");//yaris //Rav4 //錯誤的型號
		System.out.println("售出" + car.getModel() + "，" + car.getPrice());//售出Rav4，575000
		
		car.setModel("priUs");//Rav4 //priUs
		System.out.println("售出" + car.getModel() + "，" + car.getPrice());//售出priUs，1099000
		
		car.setPrice(499999);
		System.out.println("售出" + car.getModel() + "，" + car.getPrice());//售出priUs，499999
	}
}