package com.passleyart.payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public double getPaymentAmount() {
        return getWeeklySalary();
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void display() {
        System.out.println("First Name :" + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Social Security #: " + getSocialSecurityNumber() + "\n" +
                "Weekly Salary: " + getWeeklySalary() + "\n" +
                "Payment Amount: " + getPaymentAmount() + "\n");
    }
}
