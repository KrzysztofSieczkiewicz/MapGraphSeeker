package Controller;

import GUI.PointPanel.PointEvent;
import Model.PointDatabase;
import Model.Point;
import Model.PointInput;

import java.util.List;

/**
 * Singleton class for controlling flow of information about searched path between GUI and Model
 */
public class PointController {

    private static PointController pointController;
    PointDatabase db = new PointDatabase();

    /**
     * Empty constructor
     */
    private PointController() {
    }

    /**
     * Static private constructor
     * @return initializes instance of PathController or returns one if already existing
     */
    public List<Point> getPoints() {
        return db.getPoints();
    }

    public static PointController getInstance() {
        if(pointController == null) {
            pointController = new PointController();
        }
        return pointController;
    }

    /**
     * Gets input from SearchEvent from GUI and creates pathInput to be send further
     * @param se - SearchEvent send from GUI
     */
    public void findPoint(PointEvent se) {
        String PostalCode = se.getPointPostalCode();
        String City =  se.getPointCity();
        String Street = se.getPointStreet();
        String BuildingNo = se.getPointBuildingNo();
        String AptNo = se.getPointAptNo();

        PointInput pathInput  = new PointInput(PostalCode, City, Street, BuildingNo,
                AptNo);
    }

}
