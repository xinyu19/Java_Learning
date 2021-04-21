package inheritance_original;

public class TestProduct {

	public static void main(String[] args) {
//        Notebook notebook = new Notebook();
//        notebook.setName("Asus Notebook");
//        notebook.setPrice(50000);
//        notebook.setWarranty(365);
        
		Notebook notebook = new Notebook("Asus Notebook",50000, 365);
        System.out.println(notebook.getName());//Asus Notebook
        System.out.println(notebook.getPrice());//50000
        System.out.println(notebook.getWarranty());//365
	}
}
