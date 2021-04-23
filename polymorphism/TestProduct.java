package polymorphism;

import java.util.Calendar;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.GregorianCalendar;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class TestProduct {
	public static void main(String[] args) {

		// Since Notebook is one of the Product (inherit), so we could use Product to
		// use it
//		Notebook nb = new Notebook("Apple", 42999, 365);
//		Product nb = new Notebook("Apple", 42999, 365);
//		System.out.println(nb.getName() + " Price: " + nb.getPrice());// Apple Price: 42999

		Notebook nb = new Notebook("Apple", 42999, 365);// create "nb" 0800 in stack by notebook
		Product item = nb; // create "item" store the value (0800) in stack by Product
		String info = item.desc(); // this will use the "method" in Product(parent class) to run object in the
									// Notebook(child)
		System.out.println(info);// Item： Apple Price ：42999 Warranty:365 Days

		// we only can run the method in Child that also have in the Parent class
		// eventhough the actual running object is Notebook, the Product doesn't contain
		// "getWarranty()" method
//		item.getWarranty();
		nb.getWarranty();

		GregorianCalendar calendar = new GregorianCalendar(2021, 3, 10);// 2021/4/19
//        GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.APRIL ,19);//2021/4/19
		Date expDate = calendar.getTime();
		Food food = new Food("肉鬆 ", 100, expDate);
		System.out.println(food.desc());// Item： 肉鬆 Price ：100,到期日：Sat Apr 10 00:00:00 PDT 2021

		buy(nb);
		buy(food);

		// another example, using arrayList
		Product[] allProducts = { nb, food };
		buy(allProducts);

		//parent class casting to child class 
//		Notebook nb1 = item;// cannot covert from Product to Notebook
//		Food food1 = item;// cannot covert from Product to Food
		Notebook nb1 = (Notebook) item;
//		Food food1 = (Food) item;// ClassCastException: polymorphism.Notebook cannot be cast to polymorphism.Food
		// Because item doesn't run on Food
		
		
		//instanceof : using to check whether the object has some type
		System.out.println(item instanceof Notebook);//true
		System.out.println(item instanceof Food);//false
		
		//Before we casting to child class, check it
		if (item instanceof Notebook) {
			Notebook nb2 = (Notebook) item; //item is Product
			System.out.println("Warranty: " + nb1.getWarranty()); //Warranty: 365
		}	
	}

//	public static void buy(Notebook nb) {
//		System.out.println("Buy: " + nb.getName());//Buy: Apple
//	}
//	public static void buy(Food food) {
//		System.out.println("Buy: " + food.getName());//Buy: 肉鬆
//	}
	// we could use parent to run the child method so that we don't need create the
	// same method
	public static void buy(Product product) {
		System.out.println("Buy: " + product.getName());// Buy: Apple //Buy: 肉鬆
	}

	// another example, using array list
	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product p : ps) {
			System.out.println("Buy: " + p.desc());// Buy: Item： Apple Price ：42999 Warranty:365 Days //Buy: Item： 肉鬆
													// Price ：100,到期日：Sat Apr 10 00:00:00 PDT 2021
			sum = sum + p.getPrice();
		}
		System.out.println("Total: " + sum);// Total: 43099
	}

}
