package com.java.singleton;

public class SingletonOne {
    private volatile static SingletonOne singletonOne;
    //Why using volatile: The real problem is that Thread A may assign a memory space for instance before it is finished
    // constructing instance. Thread B will see that assignment and try to use it.
    // This results in Thread B failing because it is using a partially constructed version of instance.
    //https://stackoverflow.com/questions/7855700/why-is-volatile-used-in-double-checked-locking
    //https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java

    //Actual Use Case: In terms of practical use Singleton patterns are used in logging, caches, thread pools, configuration settings, device driver objects.

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
