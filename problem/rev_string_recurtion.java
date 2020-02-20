import java.util.Scanner;

public class Sample1 {

	public String rec(String str) {
		if(str.isEmpty()) {
			return str;
		}
		int i = 0;
		String l = " ";
		String str1 = "";
		int n =str.length();
		while(i<n) {
			if(str.charAt(i)==' ') {
			 str1 = rec(str.substring(i+1));
			
			 if(str.charAt(i)==' ') {
				 str1 = str1 + l;
				 return str1;
			 }
			}
			l = l +str.charAt(i);
			i++;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		
	 String n = o.nextLine();
	 Sample1 k = new Sample1();
	 String l = k.rec(n);
	 System.out.println(l);
	}

}


//output
/*
hi how are u
u are how hi
*/
