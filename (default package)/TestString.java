public class TestString {
	public static void main(String[] args) {

        System.out.println("abc".equalsIgnoreCase("ABc"));//true

        //string pool
        String name = "Gina"; //create "Gina" in string pool, return 0800 (address) to name varaible
        String name1 = "Gina"; //pool return 0800 (address) to name1 
        System.out.println(name == name1);  //true

        //new String
        String name2 = new String("Gina"); //name2 new heap
        System.out.println(name == name2);  //false

        //String compare
        System.out.println(name.equals(name2));//true
        System.out.println(name.equals(name1)); //true

        //String length
        name = "John" + "son";
        System.out.println(name.length());//7      
        System.out.println("資策會".length());//3
        System.out.println("資策會abcd".length());//7
        

        //String indexOf  count from 0, if couldn't find it -> return -1
        System.out.println("資策會305".indexOf("305"));//3
        System.out.println("資策會305".indexOf("5jh"));//-1

        //String substring , count from 0, didn't include the endIndex
        System.out.println("資策會305".substring(3));//3
        System.out.println("資策會305".substring(3,5));//30

        //concat
        System.out.println("資策會305".concat("def"));//資策會305def

        
        //split
        String csv = "課程,老師,時數";
        String[] split = csv.split(",");
        for ( int i=0 ; i< split.length ; i++){
            System.out.println(split[i]);//課程 //老師 //時數
        }

        //進階
        String helloworld = "helloworld";
        final String helloFinal = "hello";
        String helloPool = "hello";
        String helloworld1 = helloFinal+"world"; 
        //因為helloFinal是final, compiler會自動變成  "hello"+"world" 再直接改寫成 "helloworld"，pool中已經有
        String helloworld2 = helloPool + "world";
        //這裏是string concat，會用StringBuilder加，加完後會產生新的String，不在pool中
        System.out.println(helloworld==helloworld1);//true
        System.out.println(helloworld==helloworld2);//false

        String temp = "";
        for(int i=0 ; i < 10; i ++){
            temp = temp + i;
        }
        System.out.println(temp);//0123456789

        //利用StringBuilder
        StringBuilder builder = new StringBuilder();
        for(int i=0 ; i < 10; i ++){
            builder.append(i);
        }
        System.out.println(builder.toString());//0123456789
    }
}
