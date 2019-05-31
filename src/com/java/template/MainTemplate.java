package com.java.template;

public class MainTemplate {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);

        //---Other Example
        //https://github.com/java9s/template-method-pattern/blob/master/src/com/java9s/tutorials/designpattern/template/AccountCreator.java
    }
}
