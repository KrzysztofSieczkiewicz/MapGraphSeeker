package GUI.PointPanel;

import java.util.EventObject;

/**
 * Class extending EventObject for handling data events in PointPanel
 */
public class PointEvent extends EventObject {

    private String pointPostalCode;
    private String pointCity;
    private String pointStreet;
    private String pointBuildingNo;
    private String pointAptNo;

    public PointEvent(Object source) {
        super(source);
    }

    /**
     *
     * @param source - object using PointEvent
     * @param pointPostalCode
     * @param pointCity
     * @param pointStreet
     * @param pointBuildingNo
     * @param pointAptNo - apartment number
     */
    public PointEvent(Object source, String pointPostalCode, String pointCity,
            String pointStreet, String pointBuildingNo, String pointAptNo) {
        super(source);

        this.pointPostalCode = pointPostalCode;
        this.pointCity = pointCity;
        this.pointBuildingNo = pointBuildingNo;
        this.pointAptNo = pointAptNo;
        this.pointStreet = pointStreet;
    }

    public String getPointPostalCode() {
        return pointPostalCode;
    }

    public void setPointPostalCode(String pointPostalCode) {
        this.pointPostalCode = pointPostalCode;
    }

    public String getPointCity() {
        return pointCity;
    }

    public void setPointCity(String pointCity) {
        this.pointCity = pointCity;
    }

    public String getPointStreet() {
        return pointStreet;
    }

    public void setPointStreet(String pointStreet) {
        this.pointStreet = pointStreet;
    }

    public String getPointBuildingNo() {
        return pointBuildingNo;
    }

    public void setPointBuildingNo(String pointBuildingNo) {
        this.pointBuildingNo = pointBuildingNo;
    }

    public String getPointAptNo() {
        return pointAptNo;
    }

    public void setPointAptNo(String pointAptNo) {
        this.pointAptNo = pointAptNo;
    }
}
