package ie.atu.countrymanager;

  public abstract class GeographicalEntity {
    private int idNumber;
    private String name;

    public GeographicalEntity(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    // Incorporate the getter and setter method
    public int getIdNumber() {
      return idNumber;
  }

  public void setIdNumber(int idNumber) {
      this.idNumber = idNumber;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

     //Add the Abstract method as it is one of the 4 OOP
     public abstract void printDetails();
 }
