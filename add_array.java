// [1,2,3,4,5,6,7,8,9]
/*
1+(2+3)+(4+5+6)
2+(3+4)+(5+6+7)
3+(4+5)+(6+7+8)
4+(5+6)+(7+8+9)
5+(6+7)
6+(7+8)
7
8
*/
import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner n = new Scanner(System.in);
       System.out.println("enter the lenth of the array ");
       int p = n.nextInt();
       int a[] = new int[p];
       int max = 0;
       int count = 0;
       for(int i = 0;i<p;i++) {
    	   
    	   a[i] = n.nextInt();
    	   
       }
       int l = a.length;
       for(int i = 0;i<p;i++) {
    	   int t1 = a[i];
    	   if (i<p) {
    		   count = i+1;
    	   }
    	   else {
    		   count = i;
    	   }
    	   int t2 = l;
    	  int pos = 2; int v = 1;
    	  int s =1;
    	  
    	  while(true) {
    		 if(t2 > s) {
    			 while((v<=pos)&&(count<p)) {
    				 
    				 t1 = t1+a[count];
    				 v++;
    				 count++;
    			 }
    			 s = v;
    			 v = count;
    			 pos = pos +v;
    			 t2 = t2-s;
    			 if (t1>max) {
    				 max = t1;
    			 }
    		 } 
    		 else {
    			 break;
    		 }
    		   		  
    	  }
    	    
    	  l--; 
       }
       System.out.println(max);
       
     
	}

}
