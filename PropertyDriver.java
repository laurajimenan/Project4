package abc;
import java.util.Scanner;

public class PropertyDriver {
	//(console driver with main).
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//instance
		ManagementCompany managementCompany = new ManagementCompany("Laura's code", "21186144");
		//declaring and initializing choice to 0
		int choice = 0;
		//loop for choice
		while (choice != 4) {
		System.out.println("==============================");
		System.out.println("Assignment 4: Property Manager");
		System.out.println("==============================");
		System.out.println("1 - Add Property\n"
				+ "2 - Display All Properties\n"
				+ "3 - Show Total Rent\n"
				+ "4 - Exit\n");
		//loop to choose between 1 to 4
		System.out.println("Enter choice(1-4): ");
		choice = userInput.nextInt();
		userInput.nextLine();
		if (choice == 1) {
		//enter property info
		System.out.println("Enter property name: ");
		String propertyName = userInput.nextLine();
		//enter city
		System.out.println("Enter city: ");
		String city = userInput.nextLine();

		//enter monthly rent
		System.out.println("Enter montly rent: ");
		double rentAmount = userInput.nextDouble();
		userInput.nextLine();

		//enter owner name
		System.out.println("Enter owner name: ");
		String owner = userInput.nextLine();

		//Creates a ManagementCompany, adds several Property objects, and prints the company information.
		//demonstrates arrays of objects, use copy of constructors, aggregation--management property has-a property[]
		Property p = new Property(propertyName, city, rentAmount, owner);
		int result = managementCompany.addProperty(p);
		if (result >=0) {
			System.out.println("This property has been added at the index" + result + ".");
		} else if (result == -1){
			System.out.println("Error, management property is more than 5.");
		} else if (result == -2) {
			System.out.println("Error, property is invalid.");
		}
		//display all properties
	} else if (choice == 2) {
		System.out.println(managementCompany.toString());
		//loop for rent amount
	} else if (choice == 3) {
		System.out.println("Amount of rent: " + managementCompany.totalRent());
	} else if (choice == 4) {
		System.out.println("Thanks for using the program coded by Laura Nino. Goodbye!");
	} else {
		System.out.println("Choice is not valid. Please enter a number between 1-4.");
	}
		System.out.println();

		}
		userInput.close();
	}
}
