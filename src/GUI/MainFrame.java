package GUI;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    //private final int PREFERRED_WIDTH;
    //private final int PREFERRED_HEIGHT;

    private TopToolbar mainToolbar;
    private TablePanel tablePanel;
    private SearchPanel searchPanel;

    public MainFrame() {

        super("MapGraphSeeker");


        setVisible(true);
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        mainToolbar = new TopToolbar();
        tablePanel = new TablePanel();
        searchPanel = new SearchPanel();

        add(mainToolbar, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        add(searchPanel, BorderLayout.WEST);

    }

}
