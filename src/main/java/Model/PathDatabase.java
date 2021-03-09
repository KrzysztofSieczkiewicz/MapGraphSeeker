package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Database model holding methods for adding/modifying/removing data about Paths and Points
 */
public class PathDatabase {

    private ArrayList<Path> paths;
    private ArrayList<PathInput> pathInputs;

    private ArrayList<Point> points;
    private ArrayList<PointInput> pointInputs;

    public PathDatabase() {
        paths = new ArrayList<Path>();
    }

    public void addPath(Path path) {
        paths.add(path);
    }
    public void addPathInput(PathInput pathInput) {
        pathInputs.add(pathInput);
    }

    public void addPoint(Point point) {
        points.add(point);
    }
    public void addPointInput(PointInput pointInput) {
        pointInputs.add(pointInput);
    }

    public List<Path> getPaths() {
        return paths;
    }
}
