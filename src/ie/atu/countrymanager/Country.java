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
    public float getnumberOfCitizens(){
        return this.numberOfCitizens;
    }
    public double getaveragesalaryEuro(){
        return this.averagesalaryEuro;
    }

    //Setter Methods
    public void setidNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setname(String name){
        this.name = name;
    }
    public void numberOfCitizens(float numberOfCitizens){
        this.numberOfCitizens = numberOfCitizens;
    }
    public void averagesalaryEuro(double averagesalaryEuro){
        this.averagesalaryEuro= averagesalaryEuro;
    }
    





    


}
