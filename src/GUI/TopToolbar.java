package GUI;

import javax.swing.*;
import java.awt.*;

public class TopToolbar extends JMenuBar{

    private JMenuBar menuBar;

    private JMenu file;
    private JMenu edit;
    private JMenu tools;
    private JMenu about;

    private JButton open;
    private JButton save;

    public TopToolbar() {

        menuBar = new JMenuBar();
        add(menuBar);

        Dimension menuSize = new JMenuItem().getPreferredSize();
        menuSize.width = 50;
        menuSize.height = 25;

        //Main menu containing file operations
        menuBar.add(new JLabel(" |"));
        file = new JMenu("   File");
        file.setPreferredSize(menuSize);

        file.add(new JMenuItem("New"));
        file.add(new JMenuItem("Open"));
        file.add(new JMenuItem("Save"));
        file.add(new JMenuItem("Save as"));
        file.addSeparator();
        file.add(new JMenuItem("Close"));
        file.add(new JMenuItem("Exit"));
        menuBar.add(file);


        //Secondary menu containing edit operations
        menuBar.add(new JLabel("|"));
        edit = new JMenu("   Edit");
        edit.setPreferredSize(menuSize);

        edit.add(new JMenuItem("Test1"));
        edit.add(new JMenuItem("Test2"));
        edit.add(new JMenuItem("Test3"));
        edit.add(new JMenuItem("Test4"));
        edit.add(new JMenuItem("Test5"));
        menuBar.add(edit);


        //Secondary menu containing additional tools
        menuBar.add(new JLabel("|"));
        tools = new JMenu(" Tools");
        tools.setPreferredSize(menuSize);

        tools.add(new JMenuItem("Test1"));
        tools.add(new JMenuItem("Test2"));
        tools.add(new JMenuItem("Test3"));
        menuBar.add(tools);
        menuBar.add(new JLabel("|"));


        //Every element added to TopToolbar after this line will be glued to right
        menuBar.add(Box.createHorizontalGlue());

        //Secondary menu containing operations considering version and description
        menuBar.add(new JLabel("|"));
        about = new JMenu("About ");
        about.setPreferredSize(menuSize);

        about.add(new JMenuItem("Version"));
        about.add(new JMenuItem("About"));
        about.add(new JMenuItem("Help"));
        menuBar.add(about);
        menuBar.add(new JLabel("| "));
        //about.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
}
