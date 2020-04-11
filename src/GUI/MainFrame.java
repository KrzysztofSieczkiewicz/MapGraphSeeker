package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MainFrame extends JFrame {

    //private final int PREFERRED_WIDTH;
    //private final int PREFERRED_HEIGHT;

    private TablePanel tablePanel;
    private SearchPanel searchPanel;
    private JFileChooser fileChooser;

    private TextPanel textPanel;

    public MainFrame() {

        super("MapGraphSeeker");

        setUndecorated(false);
        setVisible(true);
        setSize(750,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        setJMenuBar(createMenuBar());
        tablePanel = new TablePanel();
        searchPanel = new SearchPanel();
        textPanel = new TextPanel();

        fileChooser = new JFileChooser();
        //fileChooser.addChoosebleFileFilter();

        searchPanel.setSearchListener(new StringListener() {
           public void textEmitted(String text) {
               textPanel.appendText(text);
           }
        });


        add(textPanel, BorderLayout.CENTER);
        add(searchPanel, BorderLayout.WEST);
    }



    private JMenuBar createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        Dimension menuSize = new JMenuItem().getPreferredSize();
        menuSize.width = 50;


        //List of used menus
        JMenu fileMenu;
        JMenu editMenu;
        JMenu toolsMenu;
        JMenu viewMenu;
        JMenu aboutMenu;


        //Main menu containing file operations
        menuBar.add(new JLabel(" |"));
        fileMenu = new JMenu("   File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.setPreferredSize(menuSize);


        //Instantiating File menu items
        JMenuItem loadItem = new JMenuItem("Load");
        loadItem.setMnemonic(KeyEvent.VK_O);
        loadItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        loadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(fileChooser.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fileChooser.getSelectedFile());
                }
            }
        });

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setMnemonic(KeyEvent.VK_S);
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(fileChooser.showSaveDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fileChooser.getSelectedFile());
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int action = JOptionPane.showConfirmDialog(MainFrame.this,
                        "Are You sure You want to exit?",
                        "Confitm Exit", JOptionPane.OK_CANCEL_OPTION|JOptionPane.WARNING_MESSAGE);
                if(action == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });


        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
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


        return menuBar;
    }

}
