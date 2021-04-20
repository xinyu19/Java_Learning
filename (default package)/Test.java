public class Test {

	public static void main(String[] args) {		
		//data type, variable name 
		
		//java construct an 8 byte space, to store 20000, called salary
		//long salary = 20000;		
//		long salary;
//		salary = 20000;
//		System.out.println("薪水 = " + salary); //薪水 = 20000

//		int a = 2100000000;
//      long b = 2200000000L;
		
		//overflow 
//		int c = a + a;
//		System.out.println(c); //-94967296
		
		//Precision
//		float a = 123.45678901234567890f;
//		double b = 123.45678901234567890;
//		System.out.println("Only 7 significant digits: " + a);//123.45679
//		System.out.println("Only 15 significant digits: " + b);//123.45678901234568
//		System.out.println(0.1+0.1+0.1);//0.30000000000000004
//		System.out.println(33.33*4.5);//149.98499999999999

		
		//char 只有單一一個字，單引號
//		char d = 'a';
//		System.out.println(d);//a
		
		//boolean //ture = 1, false =0
//		boolean paid = true;
//		System.out.println("Paid/Not yet? " +  paid);//Paid/Not yet? true
		
		//escape character
//		System.out.println("\"Hello World!\"");//"Hello World!"
//		System.out.println("\"Hello \n World!\"");//"Hello 
//		 										  // World!"

		//+-*/
//		int aa = 10;
//		int bb = 3;
//		int cc = aa/ bb;
//		int dd = aa % bb;
//		double ee = aa / bb;
//		double ff = (float)aa / bb;
//		double gg = (float) (aa/bb);
//		System.out.println(cc);//3
//		System.out.println(dd);//1
//		System.out.println(ee);//3
//		System.out.println(ff);//3.3333332538604736
//		System.out.println(gg);//3.0
		
		//>,==, <, >=, <=, !=
//		int age = 18;
//		boolean isAdult = (age >= 18);
//		System.out.println(isAdult);
		
		//&&, ||, &, |, !, ^
//		int a = 1, b = 2; 
//		if (a > 1 & b++ >2){  //當 a > 1 = false，「&」會繼續執行 b++，所以最後 b = 3
//			System.out.println("Hello");
//		} 
//		System.out.println("a = " + a + ", b = " + b); //a = 1, b = 3
//	    
//		a = 1;
//		b = 2; 
//		if (a > 1 && b++ > 2){ //當 a > 1 = false，「&&」不會執行 b++ ，所以最後 b = 2
//			System.out.println("Hello");
//		} 
//	    System.out.println("a = " + a + ", b = " + b);//a = 1, b = 2
//	    
//	    a = 2;
//	    b = 2; 
//	    if (a > 1 | b++ >2){
//	    	System.out.println("Hello");
//	    } 
//	    System.out.println("a = " + a + ", b = " + b); 
//
//	    a = 2 ;
//	    b = 2 ;   
//	    if (a > 1 || b++ > 2){ 
//	    	System.out.println("Hello");
//	    } 
//	    System.out.println("a = " + a + ", b = " + b); 
//	    
		
		//Shift operators
//	qq    System.out.println( 2 << 1);
	    
	    //++a,a++,--a,a--
//	    int a = 10;
//	    System.out.println(a++);//10
//	    System.out.println(a);//11
//	    a = 10;
//	    System.out.println(++a);//11
//	    System.out.println(a);//11
//	    a = 10;
//	    System.out.println("a: "+ (a++) + (++a));//a:1012
//	    System.out.println(a);//12
//	    a = 10;
//	    System.out.println("a: " + (a++) + (a++));//a:1011
//	    System.out.println(a);//12

	    //assignment operators
//	    int x = 10;
//	    int y = 20;
//	    // = x + y ;
//	    x += y;
//	    System.out.println(x);//30
//	    
//	    //conditional operators
//	    int age = 17;
//	    System.out.println( (age>=18) ? "Adult" : "Minor");//Minor
//	    
//	    int sales = 2000;
//	    int s = 100;
//	    s = (sales >1000) ? (s+10) :(s-10);
//	    System.out.println("Salary: " + s);//Salary: 110
	    
		//operator precedence
//		int x = 6;
//		int y = 10;
//		int z = ++x * y--;
//		System.out.println("x:" + x +" y:" + y + " z:" +z);//x:7 y:9 z:70
		
		
		
		//add odd number from 1 -100
		//way 1
//		int sum = 0;
//		for (int i = 1; i <= 100; i+=2) {
//			sum = sum + i;
//		}
//		System.out.println(sum);		
//	    // way 2
//		sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 1) {sum = sum + i;}
//		}
//		System.out.println(sum);
//		//way 3
//		sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum = sum + i;
//			i++;
//		}
//		//way4
//		sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum = sum + (i % 2 ==1 ?i :0);
//		}
//		System.out.println(sum);
		
		//continue, and break
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i %2 == 0) {
//				//System.out.println(i);
//				continue;
//			}
//			if (i >= 50) {//when i = 51, will get out the for loop
//				System.out.println(i);
//				break;
//			}
//			sum = sum + i;//not include i = 51
//		}
//		System.out.println(sum);//625
		
		
		//Nested for loop -- multiplication of 99
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++){
//				System.out.print(i + "x" + j + " = " + i*j + "\t");
//			}
//			System.out.println();
//		}
		
		
		//null 發生錯誤
		}	
}
