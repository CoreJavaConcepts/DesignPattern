package com.java.singleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------EnumSingleton-----------");
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        System.out.println("-----------Checking same instance----------");
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        if(one == two){
            System.out.println("Same instance");
        } else {
            System.out.println("Not same instance");
        }

        System.out.println("----------Breaking SingleTon----------------");
        System.out.println("-----Reflection------------");
        try{
            Class clazz = Class.forName("com.java.singleton.SingletonOne");//**note we need to give full name
            Constructor<SingletonOne> constr = clazz.getDeclaredConstructor();
            constr.setAccessible(true);
            SingletonOne newInstance = constr.newInstance(); //**** how to create new instance usning constructor
            SingletonOne newInstance2 = constr.newInstance();
            if(newInstance == newInstance2){
                System.out.println("Same instance");
            } else {
                System.out.println("Not same instance");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("-----Reflection------------");



    }
}
