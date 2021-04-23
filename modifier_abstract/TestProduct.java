package modifier_abstract;

public class TestProduct {
	public static void main(String[] args) {
		// Since abstract doesn't have implement in the method, only declare; thus, we
		// can't use new() to create object
//		Product p = new Product("AAA", 1000);
		Notebook nb = new Notebook();
		nb.calculate(9999);//this is an abstract, the price would be: 8999.1

	}

}
