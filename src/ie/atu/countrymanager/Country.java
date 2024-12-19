package ie.atu.countrymanager;

public class Country extends GeographicalEntity {
    //Instance Variables
    private float numberOfCitizens;
    private double averagesalaryEuro;//add average

    //Constructor
    public Country(int idNumber, String name, float numberOfCitizens, double averagesalaryEuro){
        super(idNumber, name); // Calling the constructor of the superclass (known as GeographicalEntity)
        this.numberOfCitizens = numberOfCitizens;
        this.averagesalaryEuro = averagesalaryEuro;
    }

    //Getter Methods
    
    public float getnumberOfCitizens(){
        return this.numberOfCitizens;
    }
    public double getaveragesalaryEuro(){
        return this.averagesalaryEuro;
    }

    //Setter Methods
    public void setNumberOfCitizens(float numberOfCitizens){
        this.numberOfCitizens = numberOfCitizens;    
    }
    public void setAveragesalaryEuro(double averagesalaryEuro){
        this.averagesalaryEuro = averagesalaryEuro;
    }

    // Override printDetails method (polymorphism)
    @Override
    public void printDetails() {
    System.out.println("Country ID: " + getIdNumber());
    System.out.println("Country Name: " + getName());
    System.out.println("Number of Citizens: " + getNumberOfCitizens());
    System.out.println("Average Salary (Euro): " + getAverageSalaryEuro());
  }
}

