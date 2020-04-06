package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {

    private JLabel targetPostalCodeLabel;
    private JTextField targetPostalCodeField;
    private JLabel targetCityLabel;
    private JTextField targetCityField;
    private JLabel targetBuildingNoLabel;
    private JTextField targetBuildingNoField;
    private JLabel targetAptNoLabel;
    private JTextField targetAptNoField;
    private JLabel targetStreetLabel;
    private JTextField targetStreetField;

    private JLabel sourcePostalCodeLabel;
    private JTextField sourcePostalCodeField;
    private JLabel sourceCityLabel;
    private JTextField sourceCityField;
    private JLabel sourceBuildingNoLabel;
    private JTextField sourceBuildingNoField;
    private JLabel sourceAptNoLabel;
    private JTextField sourceAptNoField;
    private JLabel sourceStreetLabel;
    private JTextField sourceStreetField;

    private JButton targetClearButton;
    private JButton sourceClearButton;
    private JButton searchButton;

    public SearchPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;


        targetPostalCodeLabel = new JLabel("Postal code: ");
        targetPostalCodeField = new JTextField(4);
        targetCityLabel = new JLabel("City: ");
        targetCityField = new JTextField(8);
        targetStreetLabel = new JLabel("Street: ");
        targetStreetField = new JTextField(8);
        targetBuildingNoLabel = new JLabel("Building no: ");
        targetBuildingNoField = new JTextField(3);
        targetAptNoLabel = new JLabel("Apartment no: ");
        targetAptNoField = new JTextField(3);

        targetClearButton = new JButton("Clear");
        targetClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                targetPostalCodeField.setText("");
                targetCityField.setText("");
                targetStreetField.setText("");
                targetBuildingNoField.setText("");
                targetAptNoField.setText("");
            }
        });


        sourcePostalCodeLabel = new JLabel("Postal code: ");
        sourcePostalCodeField = new JTextField(4);
        sourceCityLabel = new JLabel("City: ");
        sourceCityField = new JTextField(8);
        sourceStreetLabel = new JLabel("Street: ");
        sourceStreetField = new JTextField(8);
        sourceBuildingNoLabel = new JLabel("Building no: ");
        sourceBuildingNoField = new JTextField(3);
        sourceAptNoLabel = new JLabel("Apartment no: ");
        sourceAptNoField = new JTextField(3);

        sourceClearButton = new JButton("Clear");
        sourceClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sourcePostalCodeField.setText("");
                sourceCityField.setText("");
                sourceStreetField.setText("");
                sourceBuildingNoField.setText("");
                sourceAptNoField.setText("");
            }
        });

        searchButton = new JButton("Search");
        searchButton.setSize(200, 25);


        Border innerBorder = BorderFactory.createTitledBorder("Search");
        Border middleBorder = BorderFactory.createEtchedBorder();
        Border outerBorder = BorderFactory.createEmptyBorder(5, 10, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(middleBorder, innerBorder));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Insets rowInset = new Insets(0,10,0,10);



        /////////////// TARGET ///////////////
        gbc.weightx = 1;
        gbc.weighty = 0.75;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Target address:"), gbc);

        ///// First row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetPostalCodeLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetPostalCodeField, gbc);

        ///// First row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetCityLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetCityField, gbc);

        ///// Second row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetStreetLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetStreetField, gbc);

        ///// Second row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetBuildingNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetBuildingNoField, gbc);

        ///// Third row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetAptNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(targetAptNoField, gbc);

        ///// Third row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(targetClearButton, gbc);


        /////////////// SEPARATOR ///////////////
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 7;
        JSeparator sep = new JSeparator();
        gbc.anchor = GridBagConstraints.CENTER;
        sep.setPreferredSize(new Dimension(200,1));
        gbc.gridwidth = 2;
        add(sep, gbc);
        gbc.gridwidth = 1;


        /////////////// SOURCE ///////////////
        gbc.weightx = 1;
        gbc.weighty = 0.75;
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Source address:"), gbc);

        ///// First row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourcePostalCodeLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourcePostalCodeField, gbc);

        ///// First row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceCityLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceCityField, gbc);

        ///// Second row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceStreetLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceStreetField, gbc);

        ///// Second row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceBuildingNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceBuildingNoField, gbc);

        ///// Third row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceAptNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceAptNoField, gbc);

        ///// Third row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sourceClearButton, gbc);


        /////////////// SEPARATOR ///////////////
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 15;
        JSeparator sep2 = new JSeparator();
        gbc.anchor = GridBagConstraints.CENTER;
        sep2.setPreferredSize(new Dimension(200,1));
        gbc.gridwidth = 2;
        add(sep2, gbc);
        gbc.gridwidth = 1;

        ///// Temporary rest /////
        gbc.weightx = 2;
        gbc.weighty = 3;

        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(searchButton, gbc);

    }
}
