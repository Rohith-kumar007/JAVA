import java.util.Scanner;
class Animal{
	public String speciesName(String name){
		return name;
	}
}

class Mammal extends Animal{
	public Boolean hasFur(Boolean expression){
		return expression;
	}
}

class Dog extends Mammal{
	public String Breed(String breed){
		return breed;
	}
}

public class Animals{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Species name :");
		String SpeciesnameInput=scanner.nextLine();
		System.out.print("Does animal have fur ?(True or False) : ");
		Boolean hasFurInput=scanner.nextBoolean();
		scanner.nextLine();
		System.out.print("Enter the breed name : ");
		String breedInput=scanner.nextLine();
		Dog obj=new Dog();
		String Speciesname=obj.speciesName(SpeciesnameInput);
		Boolean hasfur=obj.hasFur(hasFurInput);
		String  breed=obj.Breed(breedInput);
		System.out.println("Species : " + Speciesname);
		System.out.println("Has Fur : " + hasfur);
		System.out.println("Breed : " + breed);
	}
}
