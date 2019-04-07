package com.java.composit;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private String name;
    private String description;
    private List<MenuComponent> menuComponentList;//List of same type

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        for(MenuComponent comp : menuComponentList){
            comp.print();
        }
    }
}
