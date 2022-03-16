package com.passleyart.payroll;

public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return (pricePerItem*quantity);
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
                "Payment Amount: " + getPaymentAmount() + "\n");
    }
}
