package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Database model holding methods for adding/modifying/removing data about Paths and Points
 */
public class Database {

    private ArrayList<Path> paths;
    private ArrayList<PathInput> pathInputs;

    public Database() {
        paths = new ArrayList<Path>();
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    public void addPathInput(PathInput pathInput) {
        pathInputs.add(pathInput);
    }

    public List<Path> getPaths() {
        return paths;
    }
}
