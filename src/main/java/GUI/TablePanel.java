package main.java.GUI;

import main.java.Model.Path;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class TablePanel extends JPanel {

    private JTable table;
    private PathTableModel pathTableModel;

    public TablePanel() {

        pathTableModel = new PathTableModel();
        table = new JTable(pathTableModel);

        setLayout(new BorderLayout());

        add(table, BorderLayout.CENTER);
        add(table.getTableHeader(), BorderLayout.NORTH);
        this.refresh();
    }

    public void setData(List<Path> db) {
        pathTableModel.setData(db);
    }

    public void refresh() {
        pathTableModel.fireTableDataChanged();
    }
}
