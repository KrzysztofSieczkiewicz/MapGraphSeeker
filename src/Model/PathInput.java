package Model;

import java.util.HashMap;

public class PathInput {

    private String targetPostalCode;
    private String targetCity;
    private String targetBuildingNo;
    private String targetAptNo;
    private String targetStreet;

    private String sourcePostalCode;
    private String sourceCity;
    private String sourceBuildingNo;
    private String sourceAptNo;
    private String sourceStreet;

    public PathInput(String targetPostalCode, String targetCity, String targetBuildingNo,
                String targetAptNo, String targetStreet, String sourcePostalCode,
                String sourceCity, String sourceBuildingNo, String sourceAptNo,
                String sourceStreet) {

        this.targetPostalCode = targetPostalCode;
        this.targetCity = targetCity;
        this.targetBuildingNo = targetBuildingNo;
        this.targetAptNo = targetAptNo;
        this.targetStreet = targetStreet;

        this.sourcePostalCode = sourcePostalCode;
        this.sourceCity = sourceCity;
        this.sourceBuildingNo = sourceBuildingNo;
        this.sourceAptNo = sourceAptNo;
        this.sourceStreet = sourceStreet;

    }

    public String getTargetPostalCode() {
        return targetPostalCode;
    }

    public void setTargetPostalCode(String targetPostalCode) {
        this.targetPostalCode = targetPostalCode;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(String targetCity) {
        this.targetCity = targetCity;
    }

    public String getTargetBuildingNo() {
        return targetBuildingNo;
    }

    public void setTargetBuildingNo(String targetBuildingNo) {
        this.targetBuildingNo = targetBuildingNo;
    }

    public String getTargetAptNo() {
        return targetAptNo;
    }

    public void setTargetAptNo(String targetAptNo) {
        this.targetAptNo = targetAptNo;
    }

    public String getTargetStreet() {
        return targetStreet;
    }

    public void setTargetStreet(String targetStreet) {
        this.targetStreet = targetStreet;
    }

    public String getSourcePostalCode() {
        return sourcePostalCode;
    }

    public void setSourcePostalCode(String sourcePostalCode) {
        this.sourcePostalCode = sourcePostalCode;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getSourceBuildingNo() {
        return sourceBuildingNo;
    }

    public void setSourceBuildingNo(String sourceBuildingNo) {
        this.sourceBuildingNo = sourceBuildingNo;
    }

    public String getSourceAptNo() {
        return sourceAptNo;
    }

    public void setSourceAptNo(String sourceAptNo) {
        this.sourceAptNo = sourceAptNo;
    }

    public String getSourceStreet() {
        return sourceStreet;
    }

    public void setSourceStreet(String sourceStreet) {
        this.sourceStreet = sourceStreet;
    }

}
