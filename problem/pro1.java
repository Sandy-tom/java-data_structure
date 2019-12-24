import java.util.Scanner;

public class swap1 {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int o = 0 ;
          System.out.println("enter the value ");
          int m = n.nextInt();
          System.out.println("enter the operation value");
          int v = n.nextInt();
          if(v < 0) {
        	  
        	  o = m +v;
        	  for(int i = 1;i<=m;i++) {
        	     if(i<=o) {
        		  System.out.print(i);
        	     }
        	     else {
        	    	 System.out.print(i);
        	    	 System.out.print(i);
        	     }
        	  }
          }
          else {
        	  
        	  for(int i = 1;i<=m;i++) {
        		  
        		  if(i<=v) {
        			  System.out.print(i);
        			  System.out.print(i);
        		  }
        		  else {
        			  System.out.print(i);
        		  }
        	  }
          // below it was the out put of the the program  
/*enter the value 
10
enter the operation value
-5
12345667788991010 */
            
