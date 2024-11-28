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
        
    }
    }

}
