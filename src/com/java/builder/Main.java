package com.java.builder;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder(213, "Narendra")
                .setEmpId(213)
                .setFirstName("Narendra")
                .build();
        System.out.println(emp.getEmpId());
    }
}
