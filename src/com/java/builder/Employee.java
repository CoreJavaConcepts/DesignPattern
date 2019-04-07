package com.java.builder;

public class Employee {
    //Required parameter
    private Integer empId;
    private String firstName;

    //Optional parameters
    private String lastName;
    private String middleName;
    private int age;
    private String emailId;

    //Only getters no setters
    public Integer getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    //Private constructor with builder argument
    private Employee(EmployeeBuilder builder){
        this.empId = builder.empId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.emailId = builder.emailId;
    }

    //static builder class
    public static class EmployeeBuilder {
        private Integer empId;
        private String firstName;
        private String lastName;
        private String middleName;
        private int age;
        private String emailId;
        //No getter setter inside builder

        //Builder constructor with required paramters
        public EmployeeBuilder(Integer empId, String firstName){
            this.empId = empId;
            this.firstName = firstName;
        }

        //Setting values for all non required parameters
        public EmployeeBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public EmployeeBuilder setEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        //build method to create object
        public Employee build(){
            return new Employee(this);
        }// passing this

    }


}
