package ie.atu.countrymanager;

  public abstract class GeographicalEntity {
    private int idNumber;
    private String name;

    public GeographicalEntity(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

}
