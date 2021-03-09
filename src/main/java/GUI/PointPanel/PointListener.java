package GUI.PointPanel;

import java.util.EventListener;

/**
 * Interface for handling occurrences of PointEvent
 */
public interface PointListener extends EventListener {
    void pointEventOccured(PointEvent e);
}
