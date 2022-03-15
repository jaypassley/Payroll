package com.passleyart.payroll;

public class Employee implements Payable
{

    private String firstName;
    private String lastName;
    protected String socialSecurityNumber;

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
