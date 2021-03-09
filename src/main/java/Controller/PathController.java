package Controller;

import GUI.SearchPanel.SearchEvent;
import Model.Database;
import Model.Path;
import Model.PathInput;

import java.util.List;

/**
 * Gets input from SearchEvent from GUI part and sends pathInput to
 *
 */
public class PathController {

    private static PathController pathController;

    Database db = new Database();

    private PathController() {
    }

    public List<Path> getPaths() {
        return db.getPaths();
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
