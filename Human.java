//Human
/*

**/
import java.util.*;

public class Human
{
	public static void main(String []args)
	{
		System.out.println("This is my first program that I actually understand");
		System.out.println("The following will invoke a Human Method:");
		System.out.println();
		
		Human humanObject = new Human(); // creating an Object of the class you wish to invoke in order to use its methods
		humanObject.humanMethod(); // Will Invoke the method and Print to screen
		
		Human animalObject= new Human("Tiger","Female", 13);
		animalObject.animalMethod();
	}
	
	//public String gender;
	//public String name;
	//public int age;
	public void humanMethod()
	{
		String gender= "Male";
		String name= "James";
		int age= 21;
		
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	
	public void animalMethod()
	{
		/*
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the species of the Animal: ");
		String species= keyboard.nextLine();
		System.out.print("Please enter the Gender of the Animal: ");
		String gender=keyboard.nextLine();
		System.out.print("Please enter the age of the Animal: ");
		int age= keyboard.nextInt();**/
		String species, gender;
		int age1;
		System.out.println("SPECIES: "+species+"\tGENDER: "+gender+"\tAGE: "+age1);
	}
}











