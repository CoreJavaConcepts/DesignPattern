package com.java.singleton;

public class SingletonOne {
    private volatile static SingletonOne singletonOne;

    private SingletonOne(){
        System.out.println("Singleton Created");
    }

    public static SingletonOne getInstance() {
        if(singletonOne == null){
            synchronized ( SingletonOne.class){
                if (singletonOne == null){
                    singletonOne = new SingletonOne();
                }
            }

        }
        return singletonOne;
    }
}
