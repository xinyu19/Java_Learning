package comparable;

import java.util.Arrays;
import java.util.*;

public class Sort {
	public static void main(String[] args) {
		List numbers = Arrays.asList(10, 2, 3, 1, 9, 15, 4);
		Collections.sort(numbers);
		System.out.println(numbers);// [1, 2, 3, 4, 9, 10, 15]
		
		
		List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
//        Collections.sort(words);
//        System.out.println(words);//[A, B, F, M, O, W, X]
//        Collections.sort(words, String::compareTo);
//        System.out.println(words);//[A, B, F, M, O, W, X]
        
		//sort by integer
		List<Account> accounts = Arrays.asList(new Account("Justin", "X1234", 1000),
				new Account("Monica", "X5678", 500), new Account("Irene", "X2468", 200));
		Collections.sort(accounts);
		System.out.println(accounts);// [Account(Irene, X2468, 200), Account(Monica, X5678, 500), Account(Justin,
										// X1234, 1000)]

		//sort by alphabet by comparator
		List persons = Arrays.asList(new Person("Justin", "Lin", 804), new Person("Monica", "Huang", 804),
				new Person("Irene", "Lin", 804));

		persons.sort(Comparator.<Person, String>comparing(p -> p.getLastName()).thenComparing(p -> p.getFirstName())
				.thenComparing(p -> p.getZipCode()));

		System.out.println(persons);//[Person(Monica Huang, 804), Person(Irene Lin, 804), Person(Justin Lin, 804)]

	}

}
