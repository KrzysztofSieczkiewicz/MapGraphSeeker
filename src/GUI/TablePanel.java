package GUI;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {

    private JButton add;
    private JButton addFromFile;
    private JButton delete;
    private JButton deleteFromFile;
    private JButton modify;
    private JButton modifyFromFile;

    public TablePanel() {
        setPreferredSize(new Dimension(500,700));
        setLayout(new GridBagLayout());


        add = new JButton("Add");
        add.setSize(new Dimension(60,30));
        addFromFile = new JButton("Add from file");
        delete = new JButton("Delete");
        deleteFromFile = new JButton("Delete from file");
        modify = new JButton("Modify");
        modifyFromFile = new JButton("Modify from file");


        GridBagConstraints gc = new GridBagConstraints();

        //////////////////// Table ////////////////////
        gc.weightx = 0.75;
        gc.weighty = 0.75;

        gc.gridx = 0;
        gc.gridy = 0;

        add(new JLabel("Test text"));

        //////////////////// Buttons panel ////////////////////
        gc.weightx = 0.25;
        gc.weighty = 0.25;

        gc.gridx = 1;
        gc.gridy = 0;

/*
        add(add);
        add(addFromFile);
        add(delete);
        add(deleteFromFile);
        add(modify);
        add(modifyFromFile);

 */





    }

}
