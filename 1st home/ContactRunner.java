import java.util.Scanner;

public class ContactRunner{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Contact lookup = new Contact(100);
		
		String name , number;
		int start =0;
		String answer = "y";
		
		while(!answer.equals("n") && start <= 100){
			start++;
			System.out.println("Enter a name: ");
			name = input.nextLine();
			System.out.println("Enter a number: ");
			number = input.nextLine();
			lookup.addNewContact(name, number);				
			System.out.println("Add another Contact (no more than 100)? (y/n): ");
			answer = input.nextLine();			
		}
		
		lookup.printContact();
		
		System.out.println("Search for Cell number? (y/n)");
		answer = input.nextLine();
		while(!answer.equals("n"))
		{
			System.out.println("Name please? ");
			name = input.nextLine();
			System.out.println("Phone number for "+ name + " is " 
								+ lookup.Search(name) + "");
			System.out.println("Do you want to look up another name? (y/n)");
			answer = input.nextLine();
		}
	}
}