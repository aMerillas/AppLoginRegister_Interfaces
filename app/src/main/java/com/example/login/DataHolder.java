package com.example.login;

import java.util.List;

public class DataHolder {
    private static List<Item> items;

    public static List<Item> getItems() {
        return items;
    }

    public static void setItems(List<Item> itemsList) {
        items = itemsList;
    }
}
