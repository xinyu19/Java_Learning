package array;

import java.awt.FocusTraversalPolicy;
import java.util.function.IntPredicate;

public class TestArray {
	public static void main(String[]args) {
		//Array is an Object, new
		/*
		int[] ages = new int[10]; //[size], default is 0, boolean[] default is false
	    ages[0] = 10;
	    ages[1] = 20;
	    ages[2] = 18;
	    System.out.println(ages[2]);//18
	    System.out.println("Array Length: " + ages.length);//Array Length: 10	    
		 */
		
		//使用大括號產生array並指定初值
		int[] ages = {11,34, 23};
	    System.out.println(ages[2]);//23
	    System.out.println("Array Length: " + ages.length);//Array Length: 3


	    for (int i=0 ; i< ages.length ;i++){
	        System.out.println(""+i + "="+ages[i]);//0=11 //1=34 //2=23
	    }
		
			
	    //will cause error since employees.length = 5, but we only assign two values inside
//		Employee[] employees = new Employee[5];//0800 in stack, and five spaces in heap with address 0800
	    Employee[] employees = new Employee[2];//0800 in stack, and two spaces in heap with address 0800
	    
	    Employee emp1 = new Employee();//stack emp1 = 0900, in an address(0900) with Employee() in Heap
	    emp1.name = "Mia";//Heap Employee name = Mia 
	    emp1.empno = 1001;//Heap Employee empno = 1001
	    employees[0] = emp1;//an address(0800) in Heap, save the 0900 inside 
	    System.out.println(employees[0].name);//Mia
	    
	    Employee emp2 = new Employee();//stack emp2 = 1000, in an address(1000) with Employee() in Heap
	    emp2.name = "Sean";//Heap Employee name = Sean
	    emp2.empno = 1002; //Heap Employee empno = 1002 
	    employees[1] = emp2; //an address (0800) in Heap, save the 1000 inside
	    System.out.println(employees[1].name);//Sean

	    for (int i=0 ;i < employees.length;i++){
	        System.out.println(employees[i].name);//Mia //Sean
	    }
	    
	    //the first one means raw, the second one means column 
	    int[][]x = new int[5][4];
	    x[2][0] = 100;
	    System.out.println(x[2][0]);//100
	    System.out.println(x[2][1]);//0
	    //x.length will return the numbers of raw
	    System.out.println(x.length);//5
	    //x[i].length will return the numbers of column in i raw
	    System.out.println(x[2].length);//4

	    int[][]y = {{1,2,3},{3,2,6,7}};
	    for (int i = 0; i < y.length ; i++ ) {
	    	for (int j = 0 ; j < y[i].length ; j++ ) {
	    		System.out.println(y[i][j]);//1 //2 //3 //3 //2 //6 //7
	    	}
	    }
	    
	    int[]z = {22, 33, 4, 5, 62344, 123};
	    for (int item :z) {
	    	System.out.println(item);//22 //33 //4 //5 //62344 //123
	    }
	    
	    for(int[]a :y) {
	    	System.out.println(a);//[I@1db9742  \\[I@106d69c
	    	for(int b : a) {
	    		System.out.println(b);//1 //2 //3 \\3 \\2 \\6 \\7
	    	}
	    }
	    
	}
	
}
