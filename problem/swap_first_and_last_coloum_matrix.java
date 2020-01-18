import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner n = new Scanner(System.in);
       int r =0;
       int c= 0;
		System.out.println("enter the row coloum size");
		 r = n.nextInt();
		 c = n.nextInt();
		int a[][] = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j]=n.nextInt();  // get matrix element from the user 
			}
			System.out.println("");
		}
		for(int i =0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(j==0){
                    System.out.print(a[i][c-1]);// if j rech the first element i prited the last element of the matrix
                }
                else if(j == c-1){
                    System.out.print(a[i][0]);// if j reched the last element if will prnt the first element of the matrix 
                }
                else{
                    System.out.print(a[i][j]);
                }
            }
            System.out.println("");
        }
       


	}

}
