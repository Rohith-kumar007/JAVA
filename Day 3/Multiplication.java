import java.util.Scanner;
class Multiplication{
	public static void main(String[]args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter the size of the multiplication table:");
		int n=number.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print((i*j) + " ");
			}
			System.out.println();
		}
	}
}		