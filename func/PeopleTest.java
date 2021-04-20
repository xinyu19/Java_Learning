package func;

public class PeopleTest {
	public static void main(String[] args) {
		// Object Method
		People people = new People();
		people.height = 1.7;
		people.weight = 70;
		// 使用物件方法必須要先有物件
		double BMI_Object = people.getBMI_Object();
		System.out.println(BMI_Object);//24.221453287197235
		
		//static 
		System.out.println(People.overWeightBMI);//24.0

		// 使用靜態方法不用有物件，有類別就可以了
		double BMI = People.BMI(1.7, 70.0); 
		System.out.println("BMI="+BMI);//BMI=24.221453287197235

		// 靜態方法也可以透過物件呼叫，但不建議
		System.out.println("BMI=" + people.BMI(1.7, 70.0));//BMI=24.221453287197235


	}
}
