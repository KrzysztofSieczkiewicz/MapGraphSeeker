package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Database model holding methods for adding/modifying/removing data about Paths and Points
 */
public class PointDatabase {

    private ArrayList<Path> paths;
    private ArrayList<PathInput> pathInputs;

    private ArrayList<Point> points;
    private ArrayList<PointInput> pointInputs;

    public PointDatabase() {
        paths = new ArrayList<Path>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }
    public void addPointInput(PointInput pointInput) {
        pointInputs.add(pointInput);
    }

    public List<Point> getPoints() {
        return points;
    }
}