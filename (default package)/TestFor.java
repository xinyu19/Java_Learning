public class TestFor {

	public static void main(String[] args) {
		// add odd number from 1 -100
		// way 1
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);//2500
		
		// way 2
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);//2500
		
		// way 3
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);//2500
		
		// way4
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + (i % 2 == 1 ? i : 0);
		}
		System.out.println(sum);//2500

		// continue, and break
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
				continue;
			}
			if (i >= 50) {// when i = 51, will get out the for loop
				System.out.println(i);//51
				break;
			}
			sum = sum + i;// not include i = 51
		}
		System.out.println(sum);// 625
		
		
		//while
		sum = 0;
		int i = 1;
		while(i <=100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);//5050
		
		//do... while
		sum = 0;
		i =1;
		do {//至少要執行一次
			sum = sum + i;
			i++;
		}while (i<=100);
		System.out.println(sum);//5050
	}

}
