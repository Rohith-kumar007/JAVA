import java.util.Scanner;
class Fact{
	public static void main(String[]args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter a non-negative integer:");
		int n=number.nextInt();
		int factorial=1;
		for(int i=n;i>=1;i--){
			factorial*=i;
		}
		System.out.println("Factorial of " +  n  + " is : " + factorial);
	}
}