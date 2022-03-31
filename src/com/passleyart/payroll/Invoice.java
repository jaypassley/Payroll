package com.passleyart.payroll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    public double calSubt()
    {
        return (pricePerItem*quantity);
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    LocalDate now = LocalDate.now();



    public Invoice() {
    }

    @Override
    public double getPaymentAmount() {
        return (calSubt()+calGct());
    }

    @Override
    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("invoice.txt");
            myWriter.write("\n\t\t  Passley Art Limited\n\t\t************************\n" +
                    "\t\t  360 Business District \n\t\t  Kingston, Jamaica\n" +
                    "\t\t  passleyart@yahoo.com \n\t\t   (876) CALL-PAL\n\t\t\t" +
                    (dtf.format(now)) + "\n\n" +
                "\tParts #:" + getPartNumber() + "\n" +
                "\tParts Description: " + getPartDescription() + "\n" +
                "\tQuantity: " + getQuantity() + "\n" +
                "\tPrice per Item: " + getPricePerItem() + "\n\n" +
                    "\t\t\t\t\tSubtotal: " + calSubt() + "\n" +
                "\t\t\t\t\tGCT: " + calGct() + "\n\n" +
                "\t\t\t\t\tTotal: " + getPaymentAmount() + "\n");
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
        System.out.println("\n\t\t  Passley Art Limited\n\t\t************************\n" +
                "\t\t  360 Business District \n\t\t  Kingston, Jamaica\n" +
                "\t\t  passleyart@yahoo.com \n\t\t   (876) CALL-PAL\n\t\t\t" +
                (dtf.format(now)) + "\n\n" +
                "\tParts #:" + getPartNumber() + "\n" +
                "\tParts Description: " + getPartDescription() + "\n" +
                "\tQuantity: " + getQuantity() + "\n" +
                "\tPrice per Item: " + getPricePerItem() + "\n\n" +
                "\t\t\t\t\tSubtotal: " + calSubt() + "\n" +
                "\t\t\t\t\tGCT: " + calGct() + "\n\n" +
                "\t\t\t\t\tTotal: " + getPaymentAmount() + "\n");
    }


}
