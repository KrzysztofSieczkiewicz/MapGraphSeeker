package Model;

/**
 * Class for receiving information from PointController to be written into Database or displayed by GUI
 */
public class PointInput {

    private String PostalCode;
    private String City;
    private String BuildingNo;
    private String AptNo;
    private String Street;

    public PointInput(String PostalCode, String City, String Street, String BuildingNo,
                     String AptNo) {

        this.PostalCode = PostalCode;
        this.City = City;
        this.Street = Street;
        this.BuildingNo = BuildingNo;
        this.AptNo = AptNo;

    }

    ////GETTERS AND SETTERS
    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getBuildingNo() {
        return BuildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        BuildingNo = buildingNo;
    }

    public String getAptNo() {
        return AptNo;
    }

    public void setAptNo(String aptNo) {
        AptNo = aptNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }
}
