import  java.util.Scanner;
class Vehicle{
	public String make(String Make){
		return Make;
	}
	public String model(String Model){
		return Model;
	}
}

class Car extends Vehicle{
	public int numofdoors(int doors){
		return doors;
	}
}

class bike extends Vehicle{
	public String type(String Type){
		return Type;
	}
}

public class Car_bike{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter car make : ");
		String makeInput1=scanner.nextLine();
		System.out.print("Enter car model : ");
		String modelInput1=scanner.nextLine();
		System.out.print("Enter number of doors : ");
		int numofdoorsInput=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter bike make : ");
		String makeInput2=scanner.nextLine();
		System.out.print("Enter bike model : ");
		String modelInput2=scanner.nextLine();
		System.out.print("Enter bike type : ");
		String typeInput=scanner.nextLine();
		Car obj1=new Car();
		bike obj2=new bike();
		String Make1=obj1.make(makeInput1);
		String Model1=obj1.model(modelInput1);
		int Numofdoors=obj1.numofdoors(numofdoorsInput);
		String Make2=obj2.make(makeInput2);
		String Model2=obj2.model(modelInput2);
		String Type=obj2.type(typeInput);
		System.out.println("Car make : " + Make1);
		System.out.println("Car model : " + Model1);
		System.out.println("Number of doors : " + Numofdoors);
		System.out.println("Bike make : " + Make2);
		System.out.println("Bike model : " + Model2);
		System.out.println("Bike type : " + Type);
	}
}