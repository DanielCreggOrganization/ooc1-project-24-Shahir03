package ie.atu.countrymanager;

public class Country {
    //Instance Variables
    private int idNumber; //Unique id
    private String name;
    private float numberOfCitizens;
    private double averagesalaryEuro;//add average

    //Constructor
    public Country(int idNumber, String name, float numberOfCitizens, double averagesalaryEuro){
        this.idNumber = idNumber;
        this.name = name;
        this.numberOfCitizens = numberOfCitizens;
        this.averagesalaryEuro = averagesalaryEuro;
    }

    //Getter Methods
    public int getidNumber(){
        return this.idNumber;
    }
    public String getName(){
        return this.name;
    }

    


}
