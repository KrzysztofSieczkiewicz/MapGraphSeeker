package GUI.SearchPanel;

import java.util.EventListener;

/**
 * Interface for handling occurrences of SearchEvent
 */
public interface SearchListener extends EventListener {
    void searchEventOccured(SearchEvent e);
}
