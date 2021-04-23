package exam.e6;

import java.awt.FocusTraversalPolicy;
import java.util.*;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {

		People p1 = new People("001", 21);
		People p2 = new People("002", 33);
		People p3 = new People("003", 41);

		// 實作1:請實作一個泛型的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(p1.getName(), p1);
		map.put(p2.getName(), p2);
		map.put(p3.getName(), p3);

		// 實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡，取到小數以下第一位

		// way 1
		// using for-loop to get key, and using key to get the value, using value
		// object(People) to use method getAge()
		int sum = 0;
		double avg = 0;
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String id = key;
//             System.out.println("id: "+ id);
			People people = (People) map.get(id);
//             System.out.println(people.getAge());
			sum += people.getAge();
		}
		avg = (double) sum / map.size();
		System.out.printf("%.1f", avg);// 31.7
		System.out.println();

		
		
		// Way 2
		// using Iterator to get key, and using key to get the value, using value
		// object(People) to use method getAge()
//         sum = 0;
//         avg = 0;
//         Iterator keysIterator = keys.iterator();
//         while ( keysIterator.hasNext()){
//             String key = (String) keysIterator.next();
//             People people = (People) map.get(key);
//             sum += people.getAge();    
//         } 
//         avg = (double) sum / map.size();
//         System.out.printf("%.1f", avg);//31.7

		
		
		// way 3
		// using Iterator to get value, , using value object(People) to use method
		// getAge()
//		sum = 0;
//		avg = 0;
//		Set entrySet = map.entrySet();
//		for (Object e : entrySet) {
//			Map.Entry entry = (Map.Entry) e;
//			People people = (People) entry.getValue();
//			sum += people.getAge();
//		}
//		avg = (double) sum / map.size();
//		System.out.printf("%.1f", avg);// 31.7

		
		
		// way 4
		// using Iterator to get value, , using value object(People) to use method
		// getAge()
//         sum = 0;
//         avg = 0;
//         Set entrySet = map.entrySet();
//         Iterator entryIterator = entrySet.iterator();
//         while (entryIterator.hasNext()){
//             Map.Entry entry = (Map.Entry) entryIterator.next();
//             People people = (People) entry.getValue();
//             sum += people.getAge();
//         }
//         avg = (double) sum / map.size();
//         System.out.printf("%.1f", avg);//31.7

	}

}
