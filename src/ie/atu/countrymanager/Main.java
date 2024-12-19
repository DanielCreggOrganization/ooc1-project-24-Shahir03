package ie.atu.countrymanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Create a CountryLibrary instance
        CountryLibrary library = new CountryLibrary();

        // Create Country objects
        Country country1 = new Country(1, "Qatar", 85, 3.33);
        Country country2 = new Country(2, "Ireland", 331, 6.25);
        
        // Add Country objects to the library
        library.addEntity(country1);
        library.addEntity(country2);

        // Create Scanner for user input
        Scanner userInput = new Scanner(System.in);
        int userSelection;

        // Infinite loop for the menu
        while (true) {
    //Display Menu to console
            System.out.println("");
            System.out.println("###############################");
            System.out.println("# Studient Applicarion v0.9 #");
            System.out.println("###############################");
            System.out.println("(1) Add a Country.");
            System.out.println("(2) Delete a Country.");
            System.out.println("(3) Show total number of Countries.");
            System.out.println("(4) Search for a Country by Country ID.");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter");

            // store user menu option selection
            userSelection = userInput.nextInt();        

            switch (userSelection) {
                case 1: {
                    System.out.print("Enter country ID: ");
                    int id = userInput.nextInt();
                    userInput.nextLine(); // newline
                    System.out.print("Enter country name: ");
                    String name = userInput.nextLine();
                    System.out.print("Enter number of citizens: ");
                    float citizens = userInput.nextFloat();
                    System.out.print("Enter average salary (Euro): ");
                    double salary = userInput.nextDouble();
                    
                    Country newCountry = new Country(id, name, citizens, salary);
                    library.addEntity(newCountry);
                    break;
                }
                case 2: {
                    System.out.print("Enter country ID to delete: ");
                    int id = userInput.nextInt();
                    if (library.deleteEntity(id)) {
                        System.out.println("Country deleted.");
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Total countries: " + library.countEntities());
                    break;
                }
                case 4: {
                    System.out.print("Enter country ID to search: ");
                    int id = userInput.nextInt();
                    GeographicalEntity entity = library.findEntityById(id);
                    if (entity != null) {
                        entity.printDetails(); // Demonstrating polymorphism
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Application closing - Goodbye!");
                    userInput.close();
                    return;
                }
                default:
                    System.out.println("Invalid selection. Try again.");
                    break;
            }
        }
    }
}