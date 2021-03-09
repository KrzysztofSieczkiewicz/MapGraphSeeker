package GUI.PointPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class PointPanel extends JPanel {

    private JTextField addPointPostalCodeField;
    private JTextField addPointCityField;
    private JTextField addPointStreetField;
    private JTextField addPointBuildingNoField;
    private JTextField addPointAptNoField;

    private PointListener pointListener;

    public PointPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);


        addPointPostalCodeField = new JTextField(4);
        addPointCityField = new JTextField(8);
        addPointStreetField = new JTextField(8);
        addPointBuildingNoField = new JTextField(3);
        addPointAptNoField = new JTextField(3);

        JLabel addPointPostalCodeLabel = new JLabel("Postal code: ");
        JLabel addPointCityLabel = new JLabel("City: ");
        JLabel addPointStreetLabel = new JLabel("Street: ");
        JLabel addPointBuildingNoLabel = new JLabel("Building no: ");
        JLabel addPointAptNoLabel = new JLabel("Apartment no: ");

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(event -> {
            addPointPostalCodeField.setText("");
            addPointCityField.setText("");
            addPointStreetField.setText("");
            addPointBuildingNoField.setText("");
            addPointAptNoField.setText("");
        });

        JButton addButton = new JButton("Add");
        addButton.setSize(200, 25);
        addButton.addActionListener(e -> {
            String pointPostalCode = addPointPostalCodeField.getText();
            String pointCity =  addPointCityField.getText();
            String pointStreet = addPointStreetField.getText();
            String pointBuildingNo = addPointBuildingNoField.getText();
            String pointAptNo = addPointAptNoField.getText();

            PointEvent se = new PointEvent(this, pointPostalCode, pointCity, pointStreet,
                    pointBuildingNo, pointAptNo);

            if(pointListener != null) {
                pointListener.pointEventOccured(se);
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Insets rowInset = new Insets(0,10,0,10);

        Border innerBorder = BorderFactory.createTitledBorder("Add");
        Border outerBorder = BorderFactory.createEtchedBorder();
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        /////////////// TARGET ///////////////
        gbc.weightx = 0.75;
        gbc.weighty = 0.75;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Point address:"), gbc);

        ///// First row /////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addPointPostalCodeLabel, gbc);

        gbc.gridx = 1;
        add(addPointPostalCodeField, gbc);


        //// Second row ////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addPointCityLabel, gbc);

        gbc.gridx = 1;
        add(addPointCityField, gbc);


        //// Third row ////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addPointStreetLabel, gbc);

        gbc.gridx = 1;
        add(addPointStreetField, gbc);


        //// Fourth row ////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addPointBuildingNoLabel, gbc);

        gbc.gridx = 1;
        add(addPointBuildingNoField, gbc);


        //// Fifth row ////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addPointAptNoLabel, gbc);

        gbc.gridx = 1;
        add(addPointAptNoField, gbc);


        //// Add and Clear button ////
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(addButton, gbc);

        gbc.gridx = 1;
        add(clearButton, gbc);

        /////////////// SEPARATOR ///////////////
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy++;
        JSeparator sep = new JSeparator();
        gbc.anchor = GridBagConstraints.CENTER;
        sep.setPreferredSize(new Dimension(200,1));
        gbc.gridwidth = 2;
        add(sep, gbc);
        gbc.gridwidth = 1;


        //// Temporary rest ////
        gbc.weightx = 1;
        gbc.weighty = 20;
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = rowInset;
        gbc.anchor = GridBagConstraints.LINE_START;
    }

    public void setPointListener(PointListener listener) {
        this.pointListener = listener;
    }

}
