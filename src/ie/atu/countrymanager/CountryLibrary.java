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


}
