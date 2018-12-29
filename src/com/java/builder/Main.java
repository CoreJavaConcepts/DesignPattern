package com.java.builder;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder(213, "Narendra")
                .setEmailId("narendra.nirala@gmail")
                .setLastName("Nirala")
                .build();
        System.out.println(emp.getEmpId());
    }
}
