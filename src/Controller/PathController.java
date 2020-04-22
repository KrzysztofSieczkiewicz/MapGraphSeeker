package Controller;

import GUI.SearchPanel.SearchEvent;
import Model.PathInput;

public class PathController {

    private static PathController pathController;

    private PathController() {
    }

    public static PathController getInstance() {
        if(pathController == null) {
            pathController = new PathController();
        }
        return pathController;
    }

    public void findPath(SearchEvent se) {
        String targetPostalCode = se.getTargetPostalCode();
        String targetCity =  se.getTargetCity();
        String targetBuildingNo = se.getTargetBuildingNo();
        String targetAptNo = se.getTargetAptNo();
        String targetStreet = se.getTargetStreet();

        String sourcePostalCode = se.getSourcePostalCode();
        String sourceCity = se.getSourceCity();
        String sourceBuildingNo = se.getSourceBuildingNo();
        String sourceAptNo = se.getSourceAptNo();
        String sourceStreet = se.getSourceStreet();

        PathInput pathInput  = new PathInput(targetPostalCode, targetCity, targetBuildingNo,
                targetAptNo, targetStreet, sourcePostalCode,
                sourceCity, sourceBuildingNo, sourceAptNo,
                sourceStreet);
    }

}
