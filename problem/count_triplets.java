
import java.util.HashMap; // use hash map to count the number of the triples
import java.util.Scanner;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       Scanner n = new Scanner(System.in);
       int count = 0;
       System.out.println("enter the size of the array");
       int l = n.nextInt();
       int arr[] = new int[l];
       for(int i = 0;i<l;i++) {
    	   arr[i] = n.nextInt();    // adding the number of element in the array
       }
       for(int i =0 ;i<l;i++) {
    	   map.put(arr[i], i);	   
       }
       for(int i = 0 ;i<l-1;i++) {
    	   for(int j = i+1;j<l;j++) {
    		   if(map.containsKey(arr[i]+arr[j])) {  //if adding the element it present in the hashmap it increase the  count posiblity
           
    			   count++;
    		   }
    	   }
       }
       if(count==0) {
    	   System.out.println(-1);
       }
       else {
        System.out.println(count);
       }
	}

}
