package GUI.PointPanel;

import GUI.SearchPanel.SearchEvent;

import java.util.EventListener;

public interface PointListener extends EventListener {
    void pointEventOccured(PointEvent e);
}
