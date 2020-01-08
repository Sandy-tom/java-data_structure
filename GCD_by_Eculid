public class sample {
   public int gcd(int a,int b) {
	   int min = 0;
	   int temp = 0;
	   if(a<b) {
		   min = a;
		   temp = b;
		   b = a;
		   a = temp;		   
	   }
	   else {
		   min = b;
	   }
	   min = a%min;
	   if(min == 0) {
		   System.out.print(b);
           return 1;		   
	   }
	   else {
		   gcd(b,min);
	   }
	  return 0; 
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sample k = new sample();
       int a = 2;
       int b = 11;
       k.gcd(a, b);
     
	}

}
