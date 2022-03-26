package com.passleyart.payroll;

import java.io.FileWriter;
import java.io.IOException;

public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    final double gct=0.15;

    public double calGct()
    {
        return (pricePerItem*quantity*gct);
    }


    public Invoice() {
    }

    @Override
    public double getPaymentAmount() {
        return (pricePerItem*quantity+calGct());
    }

    @Override
    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("paystub.txt");
            myWriter.write("\nEnter Payroll Info For an Invoice\n*************************************\n" +
                "Parts #:" + getPartNumber() + "\n" +
                "Parts Description: " + getPartDescription() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Price per Item: " + getPricePerItem() + "\n" +
                "GCT: " + calGct() + "\n" +
                "Payment Amount GCT Included: " + getPaymentAmount() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void display() {
        System.out.println("Parts #:" + getPartNumber() + "\n" +
                "Parts Description: " + getPartDescription() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Price per Item: " + getPricePerItem() + "\n" +
                "GCT: " + calGct() + "\n" +
                "Payment Amount GCT Included: " + getPaymentAmount() + "\n");
    }


}
