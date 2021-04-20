import java.util.function.DoubleToIntFunction;

import javax.xml.namespace.QName;

public class TestBasic {

	public static void main(String[] args) {
		// data type, variable name
		// java construct an 8 byte space, to store 20000, called salary
		// way 1
		long salary = 20000;
		// way 2
		long salary_1;
		salary_1 = 20000;
		System.out.println("薪水 = " + salary); // 薪水 = 20000
		System.out.println("薪水 = " + salary_1);// 薪水 = 20000

		// int : +- 2.1 billion (eight 0)
		int a = 2100000000;
		long b = 2200000000L;

		// overflow
		int c = a + a; // 4.2 billion
		System.out.println(c); // -94967296

		long d = (long) a + a;
		System.out.println(d); // 4.2 billion

		// Precision
		float e = 123.45678901234567890f;
		double f = 123.45678901234567890;
		System.out.println("Only 7 significant digits: " + e);// 123.45679
		System.out.println("Only 15 significant digits: " + f);// 123.45678901234568
		System.out.println(0.1 + 0.1 + 0.1);// 0.30000000000000004
		System.out.println(33.33 * 4.5);// 149.98499999999999

		// char 只有單一一個字，單引號
		char g = 'a';
		System.out.println(g);// a

		// boolean -> ture = 1, false =0
		boolean paid = true;
		System.out.println("Paid/Not yet? " + paid); // Paid/Not yet? true

		// escape character
		System.out.println("\"Hello World!\"");// "Hello World!"
		System.out.println("\"Hello \n World!\"");// "Hello
													// World!"
		System.out.println("\\\\Hello \r World\\\\"); // \\Hello
														// World\\
		// / , %, casting
		int aa = 10;
		int bb = 3;
		int cc = aa / bb;
		int dd = aa % bb;
		double ee = aa / bb;
		double ff = (float) aa / bb;
		double gg = (float) (aa / bb);
		System.out.println(cc);// 3
		System.out.println(dd);// 1
		System.out.println(ee);// 3
		System.out.println(ff);// 3.3333332538604736
		System.out.println(gg);// 3.0

		// casting
		int h = 19;
		double i = 3.5;
		System.out.println((int) (h / i));// 5
		System.out.println((int) h / i);// 5.428571428571429

		// >,==, <, >=, <=, !=
		int age = 18;
		boolean isAdult = (age >= 18);
		System.out.println(isAdult); // true

		// &&, ||, &, |, !, ^
		int x = 1, y = 2;
		if (x > 1 & y++ > 2) { // 當 x > 1 = false，「&」會繼續執行 y++，所以最後 y = 3
			System.out.println("Hello");
		}
		System.out.println("x = " + x + ", y = " + y); // x = 1, y = 3

		x = 1;
		y = 2;
		if (x > 1 && y++ > 2) { // 當 x > 1 = false，「&&」不會執行 y++ ，所以最後 y = 2
			System.out.println("Hello");
		}
		System.out.println("x = " + x + ", y = " + y);// x = 1, y = 2

		x = 2;
		y = 2;
		if (x > 1 | y++ > 2) {// 當 x > 1 = true，「|」會繼續執行 y++，所以最後 y = 3
			System.out.println("Hello");// Hello
		}
		System.out.println("x = " + x + ", y = " + y); // x =2, y =3

		x = 2;
		y = 2;
		if (x > 1 || y++ > 2) { // 當 x > 1 = true，「||」不會執行 y++ ，所以最後 y = 2
			System.out.println("Hello");// Hello
		}
		System.out.println("x = " + x + ", y = " + y);// x=2, y =2

		// Bitwise Operators
		// & -> both 1 -> 1, otherwise 0
		System.out.println(12 & 6);// 0000 1100 -> 12
									// 0000 0110 -> 6
									// 0000 0100 -> 4

		// | -> if one is 1 -> 1, otherwise 0
		System.out.println(12 | 6);// 0000 1100 -> 12
									// 0000 0110 -> 6
									// 0000 1110 -> 14

		// ^ -> if both opposite -> 1, same -> 0
		System.out.println(12 ^ 6);// 0000 1100 -> 12
									// 0000 0110 -> 6
									// 0000 1010 -> 10
		// ~ -> if 1 -> 0, 0 -> 1
		System.out.println(~6);// 0000 0110 -> 6
								// 1111 1001 -> -7

		// Shift operators
		System.out.println(12 << 2); // 0000 1100 -> 12
										// 0011 0000 -> 48

		System.out.println(12 >> 2); // 0000 1100 -> 12
										// 0000 0011 -> 3

		System.out.println(12 >>> 2);// 0000 1100 -> 12
										// 0000 0011 -> 3

		System.out.println(-126 << 1); // 1111 1111 1000 0010 -> -126
										// 1111 1111 0000 0100 -> -252

		System.out.println(-126 >> 1); // 1111 1111 1000 0010 -> -126
										// 1111 1111 1100 0001 -> -63

		System.out.println(-126 >>> 1);// 1111 1111 1111 1111 1111 1111 1000 0010 -> -126
										// 0111 1111 1111 1111 1111 1111 1100 0001 -> 2147483585

		// ++a, a++, --a, a--
		int m = 10;
		System.out.println(m++);// 10
		System.out.println(m);// 11
		m = 10;
		System.out.println(++m);// 11
		System.out.println(m);// 11
		m = 10;
		System.out.println("m: " + (m++) + (++m));// m:1012
		System.out.println(m);// 12
		m = 10;
		System.out.println("m: " + (m++) + (m++));// m:1011
		System.out.println(m);// 12
		
		// operator precedence
		int n = 5, p = 10;
		int q1 = (++n)*(p--);//q1:6*10, n=6,p=9
		int q2 = (p--)*(++n);//q2=9*7, n=7,p=8
		System.out.println("n:" + n + " p:" + p + " (++n)*(p--):" + (++n)*(p--) + " q1:" + q1 + " q2:" + q2);
		//n:7 p:8 (++n)*(p--):64 q1:60 q2:63

		// assignment operators : +=, -=, *=, /=, %=
		int r = 10;
		int s = 20;
		r = r + s ;
		System.out.println(r);//30
		r += s; //r = 30+20
		System.out.println(r);//50

		// conditional operators
		age = 16; 
		System.out.println((age >= 18) ? "Adult" : "Minor");// Minor

		int sales = 2000;
		int bounus = 100;
		bounus = (sales > 1000) ? (bounus + 10) : (bounus - 10);
		System.out.println("Bounus: " + bounus);// Bounus: 110

		//If...else...
		age = 40;
		if (age >= 18) // 先判斷是否成年
			System.out.println("成年"); //成年
		else if (age >= 30) //如果第一個if 不成立，再判斷是否>30
				System.out.println("壯年");
		else 	
			System.out.println("未成年");
		
		//
		age = 24;
		if (age >= 30) // 先判斷是否> 30
			System.out.println("壯年");
		else if (age >= 18) //如果第一個if 不成立，再判斷是否>18
				System.out.println("成年");//成年
		else 	
			System.out.println("未成年");
		
		
		//nested if...else
		age = 40;
		if (age >= 18) { // 先判斷是否 > 18
			System.out.println("成年");//成年
			if (age >= 30) { //如果第一個if 成立,再判斷是否>30
				System.out.println("壯年");//壯年
			}
		}else { 	
			System.out.println("未成年");
		}
		
		
		//Switch -> only int , char, string
//		char classroom = 'A'; 
//		char classroom = 'B';
		char classroom = 'C';
		switch (classroom) {
			case 'A':
				System.out.println("Occupied >= 30");
				break; // every case must have a break
			case 'B':
				System.out.println("30 > Occipied >= 20 ");
				break;
			default: //else
				System.out.println("default :　Others");//default :　Others
		}
	}

}
