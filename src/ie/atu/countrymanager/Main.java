package ie.atu.countrymanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
    //Create Object
    Country countryObject1= new Country( 1, "Qatar", 85, 3.33);
    System.out.println(countryObject1.getidNumber());
    System.out.println(countryObject1.getName());
    System.out.println(countryObject1.getnumberOfCitizens());
    System.out.println(countryObject1.getaveragesalaryEuro());

    //Create a Scanner
    Scanner userInput = new Scanner(System.in);
    int userSelection = 0; //Used to store user Menu option selection


    //Create infinite while loop to display Menu after every command
    while(true){
        //Display Menu to console
        System.out.println("");
        System.out.println("###############################");
        System.out.println("# Studient Applicarion v0.9 #")
        System.out.println("###############################");
        System.out.println("(1) Add a Country.");
        System.out.println("(2) Delete a Country.");
        System.out.println("(3) Show total number of Countries.");
        System.out.println("(4) Search for a Country by Country ID.");
        System.out.println("(5) Quit.");
        System.out.println("Select an option from 1 to 5 and press Enter");

    }
    }

}
