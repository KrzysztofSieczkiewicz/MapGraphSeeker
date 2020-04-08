import GUI.MainFrame;

import javax.swing.SwingUtilities;
import java.awt.*;

public class MapGraphSeeker {

    public static void main(String[] args) {
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device  = graphics.getDefaultScreenDevice();
        SwingUtilities.invokeLater( () -> new MainFrame());
        device.setFullScreenWindow(new MainFrame());
    }
}
