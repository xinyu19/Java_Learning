public class TestEmpolyee {

	public static void main(String[] args) {
		//Reference variable -> memory location, save in Heap
		Empolyee emp = new Empolyee(); //0800 (memory location)
		emp.name = "Abby";
		emp.empno = 1;
		System.out.println("Employee Number: " + emp.empno + ", Name: " + emp.name);//Employee Number: 1, Name: Abby
		
		Empolyee emp2 = new Empolyee();//0900 (memory location)
		emp2.name = "Andy";
		emp2.empno = 2;
		System.out.println("Employee Number: " + emp2.empno + ", Name: " + emp2.name);//Employee Number: 2, Name: Andy
		
		//compare two memory locations
		System.out.println(emp==emp2);//false 
		
		//change reference variable
		//原本物件emp2 因為沒有被參考到，會被JAVA的Garbage Collection 回收，已是釋放記憶體
		emp2 = emp; 
		System.out.println("Employee Number: " + emp2.empno + ", Name: " + emp2.name);//Employee Number: 1, Name: Abby
		System.out.println(emp==emp2);//true 
		
		//reference to null
		//等於清空emp2 stack value (memory address) 因為沒有被參考到，會被JAVA的Garbage Collection 回收，已是釋放記憶體
		emp2 = null;
		System.out.println(emp2.name);//Exception in thread
		
		
		

		
	}

}
