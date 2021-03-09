package main.java.GUI.SearchPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class SearchPanel extends JPanel {

    private JTextField targetPostalCodeField;
    private JTextField targetCityField;
    private JTextField targetBuildingNoField;
    private JTextField targetAptNoField;
    private JTextField targetStreetField;

    private JTextField sourcePostalCodeField;
    private JTextField sourceCityField;
    private JTextField sourceBuildingNoField;
    private JTextField sourceAptNoField;
    private JTextField sourceStreetField;

    private SearchListener searchListener;

    public SearchPanel() {

        sourcePostalCodeField = new JTextField(4);
        sourceCityField = new JTextField(8);
        sourceStreetField = new JTextField(8);
        sourceBuildingNoField = new JTextField(3);
        sourceAptNoField = new JTextField(3);

        JButton sourceClearButton = new JButton("Clear");
        sourceClearButton.addActionListener(event -> {
                sourcePostalCodeField.setText("");
                sourceCityField.setText("");
                sourceStreetField.setText("");
                sourceBuildingNoField.setText("");
                sourceAptNoField.setText("");
        });

        targetPostalCodeField = new JTextField(4);
        targetCityField = new JTextField(8);
        targetStreetField = new JTextField(8);
        targetBuildingNoField = new JTextField(3);
        targetAptNoField = new JTextField(3);

        JButton targetClearButton = new JButton("Clear");
        targetClearButton.addActionListener(event -> {
                targetPostalCodeField.setText("");
                targetCityField.setText("");
                targetStreetField.setText("");
                targetBuildingNoField.setText("");
                targetAptNoField.setText("");
        });

        JButton searchButton = new JButton("Search");
        searchButton.setSize(200, 25);
        searchButton.addActionListener(e -> {
            String targetPostalCode = targetPostalCodeField.getText();
            String targetCity =  targetCityField.getText();
            String targetBuildingNo = targetBuildingNoField.getText();
            String targetAptNo = targetAptNoField.getText();
            String targetStreet = targetStreetField.getText();

            String sourcePostalCode = sourcePostalCodeField.getText();
            String sourceCity = sourceCityField.getText();
            String sourceBuildingNo = sourceBuildingNoField.getText();
            String sourceAptNo = sourceAptNoField.getText();
            String sourceStreet = sourceStreetField.getText();

            SearchEvent se = new SearchEvent(this, targetPostalCode, targetCity, targetBuildingNo,
                    targetAptNo, targetStreet, sourcePostalCode, sourceCity, sourceBuildingNo,
                    sourceAptNo, sourceStreet);

            if(searchListener != null) {
                searchListener.searchEventOccured(se);
            }
        });


        JLabel targetPostalCodeLabel = new JLabel("Postal code: ");
        JLabel targetCityLabel = new JLabel("City: ");
        JLabel targetStreetLabel = new JLabel("Street: ");
        JLabel targetBuildingNoLabel = new JLabel("Building no: ");
        JLabel targetAptNoLabel = new JLabel("Apartment no: ");

        JLabel sourcePostalCodeLabel = new JLabel("Postal code: ");
        JLabel sourceCityLabel = new JLabel("City: ");
        JLabel sourceStreetLabel = new JLabel("Street: ");
        JLabel sourceBuildingNoLabel = new JLabel("Building no: ");
        JLabel sourceAptNoLabel = new JLabel("Apartment no: ");


        Border innerBorder = BorderFactory.createTitledBorder("Search");
        Border outerBorder = BorderFactory.createEtchedBorder();
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

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
        gbc.gridy = 8;
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
        gbc.gridy = 9;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Source address:"), gbc);

        ///// First row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourcePostalCodeLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourcePostalCodeField, gbc);

        ///// First row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceCityLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceCityField, gbc);

        ///// Second row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceStreetLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceStreetField, gbc);

        ///// Second row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceBuildingNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceBuildingNoField, gbc);

        ///// Third row, first column /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceAptNoLabel, gbc);

        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(sourceAptNoField, gbc);

        ///// Third row, second column /////
        gbc.weightx = 1;
        gbc.weighty = 0.25;
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sourceClearButton, gbc);


        /////////////// SEPARATOR ///////////////
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 16;
        JSeparator sep2 = new JSeparator();
        gbc.anchor = GridBagConstraints.CENTER;
        sep2.setPreferredSize(new Dimension(200,1));
        gbc.gridwidth = 2;
        add(sep2, gbc);
        gbc.gridwidth = 1;

        ///// Temporary rest /////
        gbc.weightx = 2;
        gbc.weighty = 20;

        gbc.gridx = 0;
        gbc.gridy = 17;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(searchButton, gbc);
    }


    public void setSearchListener(SearchListener listener) {
        this.searchListener = listener;
    }

}
