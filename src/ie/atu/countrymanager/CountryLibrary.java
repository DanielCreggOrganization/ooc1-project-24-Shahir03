package ie.atu.countrymanager;

import java.util.ArrayList;

public class CountryLibrary {
    private ArrayList<Country> countries;

    //Adding a Constructor
    public CountryLibrary(){
        countries = new ArrayList<>();
    }

    //Add a Country
    public void addCountry( Country country){
        countries.add(country);
    }

    //Delete a Country by using its ID
    public boolean deleteCountry(int idNumber){
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getidNumber() == idNumber){
                countries.remove(i);
                return true;
            }
        }
        return false; //Return false if country not Found
    }

    //Count the total number of Countries
    public int countCountries(){
        return countries.size();
    }

    //Search for a country by ID
public Country findCountrybyId(int idNumber){
    for (Country country : countries) {
        if (country.getidNumber() == idNumber){
            return country;
        }
    }
    return null; //Return null if Country was not Found
}




}
