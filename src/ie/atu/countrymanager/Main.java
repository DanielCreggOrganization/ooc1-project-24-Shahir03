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



        
    //Create Object
    Country countryObject1= new Country( 1, "Qatar", 85, 3.33);
    System.out.println(countryObject1.getidNumber());
    System.out.println(countryObject1.getName());
    System.out.println(countryObject1.getnumberOfCitizens());
    System.out.println(countryObject1.getaveragesalaryEuro());

    //Create a Scanner
    Scanner userInput = new Scanner(System.in);
    int userSelection = 0; //Used to store user Menu option selection

        

        //store user menu option selection
        userSelection = userInput.nextInt();

        if(userSelection == 5){ // Quit

            System.out.println("Student Application Closing - Goodbye!");
            //Closer the user Input Scanner
            userInput.close();
            break; //Break ot of display infinite loop

             } //End of if

         } //End of while

    } // End of Main Method

} //End of Main Class
