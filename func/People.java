package func;

public class People {
	double height;
	double weight;

	// Object Method, must have new to call the method
	public double getBMI_Object() {
		return weight / (height * height);
	}

	// 每次new物件時.都會產生相對應的屬性空間，但此屬性為固定常數，會浪費記憶體空間
//	double overweightBMI =24;

	// 用static屬於類別屬性，建立new並不會額外產生多個，存在MetaSpace
	// static : depends on "class", no need an object (new), should write in class
	static double overWeightBMI = 24;

	// using static method
	public static double BMI(double height, double weight) {
		return weight / (height * height);
	}
	
	//一般方法可以呼叫static method
	// BMI = 體重(公斤) / 身高平方
	public double getBMI() {
		double BMI = People.BMI(height, weight);
		return BMI;
	}

	// compile會有錯, static method only can call static method, can't call non static method and attribute
	// public static double BMI(){ return weight / (height*height);}

}
