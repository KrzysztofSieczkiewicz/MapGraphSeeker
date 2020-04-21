package Model;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Path> paths;

    public Database() {
        paths = new ArrayList<Path>();
    }

    public void addPath(Path path) {
        paths.add(path);
    }

    public List<Path> getPath() {
        return paths;
    }
}
