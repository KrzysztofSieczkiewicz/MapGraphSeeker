package main.java.GUI;

import main.java.GUI.PointPanel.PointPanel;
import main.java.GUI.SearchPanel.SearchPanel;

import javax.swing.*;


public class TabbedInputPanel extends JTabbedPane {

    private SearchPanel searchPanel;
    private PointPanel pointPanel;


    public TabbedInputPanel() {

        // SearchPanel
        searchPanel = new SearchPanel();
        ImageIcon searchTabIcon = new ImageIcon("images/SearchTab_icon_byFreepik.png");
        addTab("Path", searchTabIcon, searchPanel);

        // PointPanel
        pointPanel = new PointPanel();
        ImageIcon pointTabIcon = new ImageIcon("images/PointTab_icon_byFreepik.png");
        addTab("Point", pointTabIcon, pointPanel);
    }


    public SearchPanel getSearchPanel() {
        return searchPanel;
    }
}
