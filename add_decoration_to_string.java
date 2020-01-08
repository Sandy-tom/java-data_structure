//the function must calculate the number of alphabet A in str and number of digits D in str 
// repace each alphabets with '*' if D is grater than the A 
// and else replace '*'in all Digits in the string 

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner j = new Scanner(System.in);
		int D=0;
		int A=0;
		System.out.println("enter the string");
		String s=j.nextLine();
		char[] a =s.toCharArray();
		int n = a.length;
		for(int i = 0;i<n;i++) {
			
			if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z')) {
				
				A++;
				
			}
			else {
				D++;
			}
		}
		if(A>D) {
			for(int i = 0;i<n;i++) {
				
				if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z')) {
					
					a[i] = '*';
				}
			}
			
		}
		else {
			for(int i = 0;i<n;i++) {
			if(a[i]>='0'&& a[i]<='9') {
				
				a[i] = '*';
			}
			}
			
		}
		
      s = String.valueOf(a);
      System.out.println(s);
	}

}
/*
enter the string
s1r2a3ck
*1*2*3**

enter the string
123ABCD007
***ABCD***

*/
