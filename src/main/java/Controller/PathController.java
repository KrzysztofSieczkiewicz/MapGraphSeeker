package Controller;

import GUI.SearchPanel.SearchEvent;
import Model.PathDatabase;
import Model.Path;
import Model.PathInput;

import java.util.List;

/**
 * Singleton class for controlling flow of information about searched path between GUI and Model
 */
public class PathController {

    private static PathController pathController;
    PathDatabase db = new PathDatabase();

    /**
     * Empty constructor
     */
    private PathController() {
    }

    /**
     * Static private constructor
     * @return initializes instance of PathController or returns one if already existing
     */
    public List<Path> getPaths() {
        return db.getPaths();
    }

    public static PathController getInstance() {
        if(pathController == null) {
            pathController = new PathController();
        }
        return pathController;
    }

    /**
     * Gets input from SearchEvent from GUI and creates pathInput to be send further
     * @param se - SearchEvent send from GUI
     */
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
