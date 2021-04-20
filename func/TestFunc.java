package func;

public class TestFunc {
	public static int add(int a, int b) {
		int sum = a + b;
		System.out.println("Add Func= " + sum);// Add Func= 5
		return sum;
	}

	public static int sum(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int c = add(2, 3);
		System.out.println(c);// 4

		int[] x = { 1, 2, 3, 4, 5 };
		int sumValue = sum(x);
		System.out.println(sumValue);// 15
	}
}
