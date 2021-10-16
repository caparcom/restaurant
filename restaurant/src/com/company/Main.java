package com.company;

import RestaurantMenu.MenuItem;
import RestaurantMenu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Menu testMenu = new Menu();
        MenuItem burger = new MenuItem("Booger", 8.99, "Honestly it's a pretty normal burger", "DINDIN or LUNSH");
        testMenu.addItem(burger);
        System.out.println(testMenu.showMenu());

    }
}
