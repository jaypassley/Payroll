package com.passleyart.payroll;

public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quality;
    private double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
