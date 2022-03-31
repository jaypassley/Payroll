package com.passleyart.payroll;

import java.io.FileWriter;
import java.io.IOException;

public class CommissionEmployee extends Employee {

    private double grossSale;
    private double commissionRate;

    public double calGrossPay(){ return (grossSale*commissionRate);}

    public double CalNTH()
    {
        return (calGrossPay()*NHT);
    }

    public double CalEduTax()
    {
        return (calGrossPay()*EduTax);
    }

    public double CalNIS()
    {
        return (calGrossPay()*NIS);
    }

    public double Deductions()
    {

        return (CalNIS()+CalNTH()+CalEduTax());
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getPaymentAmount() {
        return (calGrossPay()-Deductions());
    }

    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("paystub.txt");
            myWriter.write("\nCompany: Passley Art Limited\n" +
                    "Employee's Name: " + getFirstName() + " " + getLastName() + "\n" +
                    "Social Security #: " + getSocialSecurityNumber() + "\n" +
                    "Payment Date: " + (dtf.format(now)) +  "\n\n" +
                    "Gross Pay:\t" + calGrossPay() + "\n" +
                    "\tGross Sale: " + grossSale + "\n" +
                    "\tCommission Rate: " + commissionRate + "\n" +
                    "Deductions-\n" +
                    "\tNHT: " + CalNTH() + "\n" +
                    "\tNIS: " + CalNIS() + "\n" +
                    "\tEducation Tax: " + CalEduTax() + "\n" +
                    "Total Deductions: " + Deductions() + "\n\n" +
                    "Net Salary: " + getPaymentAmount() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void display() {
        System.out.println("\nCompany: Passley Art Limited\n" +
                "Employee's Name: " + getFirstName() + " " + getLastName() + "\n" +
                "Social Security #: " + getSocialSecurityNumber() + "\n" +
                "Payment Date: " + (dtf.format(now)) +  "\n\n" +
                "Gross Pay:\t" + calGrossPay() + "\n" +
                "\tGross Sale: " + grossSale + "\n" +
                "\tCommission Rate: " + commissionRate + "\n" +
                "Deductions-\n" +
                "\tNHT: " + CalNTH() + "\n" +
                "\tNIS: " + CalNIS() + "\n" +
                "\tEducation Tax: " + CalEduTax() + "\n" +
                "Total Deductions: " + Deductions() + "\n\n" +
                "Net Salary: " + getPaymentAmount() + "\n");
    }

}
