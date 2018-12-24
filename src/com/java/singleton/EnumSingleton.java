package com.java.singleton;

public enum EnumSingleton {
    INSTANCE;

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    //https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java

    //Since enums are inherently serializable, we don't need to implement it with a serializable interface.
    // The reflection problem is also not there.
    // Therefore, it is 100% guaranteed that only one instance of the singleton is present within a JVM.
    // Thus, this method is recommended as the best method of making singletons in Java.

    //enum fields are compile time constants, but they are instances of their enum type.
    // And, they're constructed when the enum type is referenced for the first time.

    //By default creation of Enum instance is thread safe
    //Enum constants are implicitly static and final


    //One thing to remember here is when serializing an enum, field variables are not get serialized.
    // For example, if we serialize and deserialize above SingletonEnum class, we will loss the value of the int value field

    //Below constructor is created by default, created here just for demo

    /*private EnumSingleton() {
        System.out.println("instance created");
    }*/
}
