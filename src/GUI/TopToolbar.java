package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class TopToolbar extends JMenuBar{

    private JMenuBar menuBar;

    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu toolsMenu;
    private JMenu viewMenu;
    private JMenu aboutMenu;

    private JButton open;
    private JButton save;

    private JMenuItem newItem;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem saveAsItem;
    private JMenuItem exitItem;

    private JMenuItem fullscreenItem;
    /*
    private JMenuItem ;
    private JMenuItem ;
    private JMenuItem ;
    private JMenuItem ;
    private JMenuItem ;
    private JMenuItem ;
     */


    public TopToolbar() {

        menuBar = new JMenuBar();
        add(menuBar);

        Dimension menuSize = new JMenuItem().getPreferredSize();
        menuSize.width = 50;
        menuSize.height = 15;

        //Main menu containing file operations
        menuBar.add(new JLabel(" |"));
        fileMenu = new JMenu("   File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.setPreferredSize(menuSize);

        //Instantiating File menu items

        exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int action = JOptionPane.showConfirmDialog(TopToolbar.this,
                        "Are You sure You want to exit?",
                        "Confitm Exit", JOptionPane.OK_CANCEL_OPTION|JOptionPane.WARNING_MESSAGE);
                if(action == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });

        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Save as"));
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);


        //Secondary menu containing edit operations
        menuBar.add(new JLabel("|"));
        editMenu = new JMenu("   Edit");
        editMenu.setPreferredSize(menuSize);

        editMenu.add(new JMenuItem("Test1"));
        editMenu.add(new JMenuItem("Test2"));
        editMenu.add(new JMenuItem("Test3"));
        editMenu.add(new JMenuItem("Test4"));
        editMenu.add(new JMenuItem("Test5"));
        menuBar.add(editMenu);


        //Secondary menu containing view preferences
        menuBar.add(new JLabel("|"));
        viewMenu = new JMenu("   View");
        viewMenu.setPreferredSize(menuSize);

        fullscreenItem = new JMenuItem("Fullscreen");
        fullscreenItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
        /*
        fullscreenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
        
         */

        editMenu.add(fullscreenItem);
        menuBar.add(viewMenu);

        //Secondary menu containing additional tools
        menuBar.add(new JLabel("|"));
        toolsMenu = new JMenu(" Tools");
        toolsMenu.setPreferredSize(menuSize);

        toolsMenu.add(new JMenuItem("Test1"));
        toolsMenu.add(new JMenuItem("Test2"));
        toolsMenu.add(new JMenuItem("Test3"));
        menuBar.add(toolsMenu);
        menuBar.add(new JLabel("|"));


        //Every element added to TopToolbar after this line will be glued to right
        menuBar.add(Box.createHorizontalGlue());

        //Secondary menu containing operations considering version and description
        menuBar.add(new JLabel("|"));
        aboutMenu = new JMenu("About ");
        aboutMenu.setPreferredSize(menuSize);

        aboutMenu.add(new JMenuItem("Version"));
        aboutMenu.add(new JMenuItem("About"));
        aboutMenu.add(new JMenuItem("Help"));
        menuBar.add(aboutMenu);
        menuBar.add(new JLabel("| "));





    }
}
