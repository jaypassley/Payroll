package com.passleyart.payroll;

import java.io.FileWriter;
import java.io.IOException;


public class SalariedEmployee extends Employee{

    private double weeklySalary;




    public double CalNTH()
    {
        return (weeklySalary*NHT);
    }

    public double CalEduTax()
    {
        return (weeklySalary*EduTax);
    }

    public double CalNIS()
    {

        return (weeklySalary*NIS);
    }

    public double Deductions()
    {

        return (CalNIS()+CalNTH()+CalEduTax());
    }

    public double getPaymentAmount() {
        return (getWeeklySalary()-Deductions());
    }

    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("paystub.txt");
            myWriter.write("\nCompany: Passley Art Limited\n" +
                    "Employee's Name: " + getFirstName() + " " + getLastName() + "\n" +
                    "Social Security #: " + getSocialSecurityNumber() + "\n" +
                    "Payment Date: " + (dtf.format(now)) +  "\n\n" +
                    "Basic Pay:\t" + getWeeklySalary() + "\n" +
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

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void display() {
        System.out.println("\nCompany: Passley Art Limited\n" +
                "Employee's Name: " + getFirstName() + " " + getLastName() + "\n" +
                "Social Security #: " + getSocialSecurityNumber() + "\n" +
                "Payment Date: " + (dtf.format(now)) +  "\n\n" +
                "Basic Pay:\t" + getWeeklySalary() + "\n" +
                "Deductions-\n" +
                "\tNHT: " + CalNTH() + "\n" +
                "\tNIS: " + CalNIS() + "\n" +
                "\tEducation Tax: " + CalEduTax() + "\n" +
                "Total Deductions: " + Deductions() + "\n\n" +
                "Net Salary: " + getPaymentAmount() + "\n");
    }
}
