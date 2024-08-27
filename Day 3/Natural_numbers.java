import java.util.Scanner;
class Natural_numbers{
	public static void main(String[]args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int n=number.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
			System.out.println("Sum of first " + n + " natural numbers :" + sum);
	}
}