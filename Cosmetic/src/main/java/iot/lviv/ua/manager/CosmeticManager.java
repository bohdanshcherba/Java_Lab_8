package iot.lviv.ua.manager;

import iot.lviv.ua.items.ItemType;
import iot.lviv.ua.items.Items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CosmeticManager {

    private List<Items> items = new ArrayList<Items>();

    public CosmeticManager(List<Items> items) {
        this.items.addAll(items);
    }

    public void addItem(Items item) {
        this.items.add(item);

    }

    public void printAllItems() {
        items.forEach(System.out::println);
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC) {
            items.stream().sorted(Comparator
                    .comparing(Items::getPrice))
                    .forEach(System.out::println);
        } else {
            items.stream().sorted(Comparator
                    .comparing(Items::getPrice)
                    .reversed()).forEach(System.out::println);
        }
    }

    public void searchByType(ItemType type) {

        items.stream().filter(item -> item.getType()
                .equals(type))
                .forEach(System.out::println);

    }
}
