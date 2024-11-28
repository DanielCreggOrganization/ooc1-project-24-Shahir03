package ie.atu.countrymanager;

public class Country {
    //Instance Variables
    private int idNumber; //Unique id
    private String name;
    private float numberofCitizens;
    private double averagesalaryEuro;//add average

    //Constructor
    public Country(int idNumber, String name, float numberofCitizens, double averagesalaryEuro){
        this.idNumber = idNumber;
        this.name = name;
        this.numberofCitizens = numberofCitizens;
        this.averagesalaryEuro = averagesalaryEuro;

    }


}
