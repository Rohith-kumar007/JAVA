class Animal{
	public void makeSound(){
		System.out.println("Animal makes a sound ");
	}
}
class Dog extends Animal{
	public void makeSound(){
		System.out.println("Dog barks");
	}
}

public class Overriding{
	public static void main(String[] args){
		Animal myAnimal=new Animal();
		myAnimal.makeSound();
		Animal myDog=new Dog();
		myDog.makeSound();
	}
}