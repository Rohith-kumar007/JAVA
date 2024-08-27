import java.util.Scanner;
public class GreetStudents {

    public static void greetStudents(String[] students) {
	for (String student : students) {
		System.out.println("Hello, " + student + "!");
        }
    }

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter size of the array:");
	int size=scanner.nextInt();
	scanner.nextLine();
	String[] name=new String[size];
	for(int i=0;i<size;i++){
		System.out.print("Name" + (i+1) + ":");
		name[i]=scanner.nextLine();
	}
        greetStudents(name);
    }
}