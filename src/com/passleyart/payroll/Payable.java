package com.passleyart.payroll;

public interface Payable {
    double getPaymentAmount();
    void writeToFile();
}
