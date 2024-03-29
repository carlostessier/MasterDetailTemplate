package es.carlostessier.lectorblogs.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.


        addItem(new DummyItem("1", "Layouts","descripción 1"));
        addItem(new DummyItem("2", "Vistas","descripción 2"));
        addItem(new DummyItem("3", "Edición visual de las vistas","descripción 3"));
        addItem(new DummyItem("4", "La clase View","descripción 4"));
        addItem(new DummyItem("5", "La clase TextView","descripción 5"));
        addItem(new DummyItem("6", "Eventos","descripción 6"));
        addItem(new DummyItem("7", "ListViews","descripción 7"));
        addItem(new DummyItem("8", "Menús y mensajes","descripción 8"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String description;

        public DummyItem(String id, String content, String description) {
            this.id = id;
            this.content = content;
            this.description = description;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
