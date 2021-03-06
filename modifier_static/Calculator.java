package modifier_static;

public class Calculator {
	 public static double tax;
	    /* static block只會被執行一次 */
	    static {
	        tax = 0.5;
	    }

	    /* static方法不能直接呼叫 non-static方法*/
	    public static void calculate(){
	        //taxValue(123);
	        //但是可以先 new物件再呼叫
	        /*
	        Calculator calculator = new Calculator();
	        calculator.taxValue(123);
	        */
	    }
	    
	    public double taxValue(int price){
	        return price * tax;
	    }

	    //non-static方法不能覆寫static方法，改變其行為
	    /*
	    public void calculate(){
	        
	    }
	    */
}
