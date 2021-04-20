package array;
//print the array maximum,minimum,sum/average 

public class ArrayLab3 {
    public static void main(String[] args) {
    	

        int[] x = { 1,11,34,14,55,6};
        int max = 0;
        int min = 99999;
        int sum = 0;
        for (int  i= 0; i < x.length ; i++ ){
            if ( x[i] > max  ){
                max = x[i];
                System.out.println(max);//1  //11 //34 //55
            }
            if ( x[i] < min ){
                min = x[i];
                System.out.println(min);//1
            }
            sum = sum + x[i];
        }

        System.out.println("max="+max+",min="+min);
        System.out.println("avg="+(double)sum/x.length);
        
    }
}