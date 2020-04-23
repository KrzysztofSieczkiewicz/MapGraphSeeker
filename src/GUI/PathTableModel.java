package GUI;

import Model.Path;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PathTableModel extends AbstractTableModel {

    private List<Path> db;

    private String[] colNames = {"Target postal code", "Target city", "Target building", "Target apartment",
            "Target street", "Source postal code", "Source city", "Source building", "Source apartment", "Source street"};

    public void setData(List<Path> db) {
        this.db = db;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Path path = db.get(row);

        switch(column) {
            case 0:
                return path.getTargetPostalCode();
            case 1:
                return path.getTargetCity();
            case 2:
                return path.getTargetBuildingNo();
            case 3:
                return path.getTargetAptNo();
            case 4:
                return path.getTargetStreet();
            case 5:
                return path.getSourcePostalCode();
            case 6:
                return path.getSourceCity();
            case 7:
                return path.getSourceBuildingNo();
            case 8:
                return path.getSourceAptNo();
            case 9:
                return path.getSourceStreet();
        }
        return null;
    }

}
