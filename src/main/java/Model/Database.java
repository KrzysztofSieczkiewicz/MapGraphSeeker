package main.java.Model;

import java.util.ArrayList;
import java.util.List;


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
