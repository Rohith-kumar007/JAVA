class Calculator{
	 int add(int num1,int num2){
		return num1 + num2;
	}
	 int add(int num1,int num2,int num3){
		return num1 + num2 + num3;
	}
	 double add(double num1,double num2){
		return num1 +num2;
	}
}

public class Overload{
	public static void main(String [] args){
		Calculator obj=new Calculator();
		int n1=obj.add(4,5);
		int n2=obj.add(3,9,7);
		double n3=obj.add(5.5,8.7);
		System.out.println("Sum of Two Integer Numbers : " + n1);
		System.out.println("Sum of Three Integer Numbers : " + n2);
		System.out.println("Sum of Two double Numbers : " + n3);
	}
}