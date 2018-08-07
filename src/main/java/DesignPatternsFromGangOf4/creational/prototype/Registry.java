package DesignPatternsFromGangOf4.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setIname("MI");
        movie.setPrice(20.50);
        movie.setRuntime("50");
        items.put("Movie", movie);

        Book book = new Book();
        book.setIname("HP");
        book.setPrice(35);
        book.setPrice(300);
        items.put("Book", book);

    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException cne) {
            cne.printStackTrace();
        }
        return item;
    }
}
