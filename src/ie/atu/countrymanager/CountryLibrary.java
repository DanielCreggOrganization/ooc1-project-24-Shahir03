package ie.atu.countrymanager;

import java.util.ArrayList;

public class CountryLibrary {
    private ArrayList<GeographicalEntity> entities;

    //Adding a Constructor
    public CountryLibrary(){
        entities = new ArrayList<>();
    }

    //Add a geographical entity
    public void addEntity(GeographicalEntity entity){
        entities.add(entity);
    }

    //Delete a Country by using its ID
    public boolean deleteEntity(int idNumber){
        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).getIdNumber() == idNumber){
                entities.remove(i);
                return true;
            }
        }
        return false; //Return false if country not Found
    }

    //Count the total number of Countries
    public int countEntities(){
        return entities.size();
    }

    //Search for a country by ID
public GeographicalEntity findEntityById(int idNumber){
    for (GeographicalEntity entity: entities) {
        if (entity.getIdNumber() == idNumber){
            return entity;
        }
    }
    return null; //Return null if Country was not Found
}




}
