//Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
public class substring {
	public int sub_string(int l,int s ,int a[]){
		int curr = a[0];
		int start = 0;
		for(int i = 1;i<l;i++) {
			while(curr>s && start< i-1) {
				curr = curr - a[start];
				start++;
			}
			if (curr == s) {
				 System.out.println(start+1+" "+i);
			     return 1;
			}
			else {
				
				curr +=a[i];
			}
			
		}
		return 0;
		
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner j = new Scanner(System.in);
		System.out.println("enter the testcase  ");// how many tast case u need to run the code
		int n = j.nextInt();
		while(n>0) {
		System.out.println("enter arry leth");//get the length of the array
		int l = j.nextInt();
		System.out.println("enter the number arry");
		int a[]= new int[l];
		for(int i=0;i<l;i++) {
			a[i] = j.nextInt();
		}
		System.out.println("enter number to find ");
		int s = j.nextInt();// enter the value to find
		 substring l1 = new substring();
		int r =  l1.sub_string(l, s, a);
		if(r==-1) {
			
			System.out.println(-1);
		}
		n--;
	}
}		

}
