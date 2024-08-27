import java.util.Scanner;
class Skipeven{
	public static void main(String[]args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enetr a positive integer:");
		int n=number.nextInt();
		for(int i=0;i<=n;i++){
			if(i%2==0)
				continue;
			System.out.print(i + " ");
		}
	}
}