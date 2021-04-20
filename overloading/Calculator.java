package overloading;

public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public float add(float a, float b) {
		float sum = a + b;
		return sum;
	}

	// 無法利用不同的回傳值達到overloading
//	public long add(int a, int b) {
//		long sum = a + b;
//		return sum;
//	}
}
