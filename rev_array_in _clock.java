import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
        System.out.println("enter the value ");
        int v = n.nextInt();// get the input integer value
        int max = v;
        String k = Integer.toString(v); // convert the input integer value to the sting 
        int l = k.length();
        int s = l;
        char a[] = k.toCharArray();// convert the string to character array
        char t = 1;
        while(s>0) {
        	t = a[l-1];
        for(int i =l-1;i>0;i--) {   // for loop for the rotate the array in the clocak direction
              a[i] = a[i-1];  
        }
        a[0] = t;
        k = String.valueOf(a);// convert the array to the string formet
        v = Integer.parseInt(k);
        if(max<v) {
        	max = v;
        }
        s--;
      }
       System.out.println(max); 
	}

}
