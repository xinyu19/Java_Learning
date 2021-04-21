package inheritance;

public class TestProduct {
	public static void main(String[] args) {
		///if name price modifier is public / protected
		Product p = new Product("AAA",1000);
		System.out.println(p.name + " , " + p.price );//AAA , 1000
		
		Notebook nb = new Notebook("Apple", 42999, 365);
		System.out.println(nb.getName() + " Price: " + nb.getPrice());// Apple Price: 42999
		
	}

}
