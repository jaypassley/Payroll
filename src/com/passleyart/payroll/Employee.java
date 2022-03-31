package com.passleyart.payroll;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Payable
{

    private String firstName;
    private String lastName;
    protected String socialSecurityNumber;
    final double NHT = 0.03;
    final double EduTax = 0.02;
    final double NIS =0.02;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    LocalDate now = LocalDate.now();

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public void writeToFile() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
