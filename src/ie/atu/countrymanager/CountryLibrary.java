package ie.atu.countrymanager;

import java.util.ArrayList;

public class CountryLibrary {
    private ArrayList<GeographicalEntity> countries;

    //Adding a Constructor
    public CountryLibrary(){
        countries = new ArrayList<>();
    }

    //Add a geographical entity
    public void addEntity( GeographicalEntity entity){
        countries.add(entity);
    }

    //Delete a Country by using its ID
    public boolean deleteEntity(int idNumber){
        for (int i = 0; i < entities.size(); i++) {
            if (countries.get(i).getidNumber() == idNumber){
                countries.remove(i);
                return true;
            }
        }
        return false; //Return false if country not Found
    }

    //Count the total number of Countries
    public int countEntities(){
        return countries.size();
    }

    //Search for a country by ID
public GeographicalEntity findEntityById(int idNumber){
    for (Country country : entities) {
        if (entity.getidNumber() == idNumber){
            return entity;
        }
    }
    return null; //Return null if Country was not Found
}




}
