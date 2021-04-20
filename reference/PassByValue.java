package reference;

public class PassByValue {
	public static void main(String[] args) {
		//Java是pass-by-value，不是pass-by-reference
		
		//primitive data 
		int a = 10;
		System.out.println("呼叫print前 a值 =" + a);// 呼叫print前 a值 =10
		print(a);
		//after "{", the stack memory will clean up
		System.out.println("呼叫print後 a值 = " + a);// 呼叫print後 a值 = 10
		
		//Object
		Employee e = new Employee();//0900, stack memory (0900), Heap address 0900 with name, age, empno
		e.name = "David";
		e.age = 20;
		e.empno = 1001;
		System.out.println("更新前:"+ e.name + " " + e.empno + " " + e.age );//更新前:David 1001 20
		update(e);
		//the heap would be updated but the value in stack doesn't change
		System.out.println("更新後:"+ e.name + " " + e.empno + " " + e.age);//更新後:Sebrina 1001 18
		
		//String, since string has a string pool in heap
		String name = "David";//name 0800 in stack memory, get David in string pool
        System.out.println("before update name = " + name);//before update name = David
        update(name);
        //name address still in 0800
        System.out.println("after update name = " + name);//after update name = David
	}

	public static void print(int aa) {
		aa = aa + 1;
		System.out.println("印出print方法中的aa= " + aa);// 印出print方法中的aa=11
	}

	public static void update(Employee emp) {
		emp.age = 18; //Heap 0900 age updated to 18
		emp.name = "Sebrina";
	}
	
	public static void update(String name1){
        name1 = "Sebrina";//name1 0900 in stack memory, get/create Sebrina in string pool
    }
}
