package com.java.composit;

public class Main {
    public static void main(String[] args) {

        // Menu (top level eg Dinner Menu) and MenuItem (lower level eg thai curry) both extends Menucomponent
        // MenuComponent have methods of both Menu and MenuItem

        MenuComponent pancakeHouseMenu =  new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT Menu", "Desserts");

        MenuComponent allMenu = new Menu("ALL MENU", "All menu combined");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dessertMenu);

        dinerMenu.add(new MenuItem("Pasta", "with sauce", 3.8, true));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();


    }
}
