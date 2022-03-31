package com.passleyart.payroll;

import java.io.FileWriter;
import java.io.IOException;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public double calGrossPay(){ return (wage*hours);}

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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
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
                    "\tWage: " + wage + "\n" +
                    "\tHours Worked: " + hours + "\n" +
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
                "\tWage: " + wage + "\n" +
                "Hours Worked: " + hours + "\n" +
                "Deductions-\n" +
                "\tNHT: " + CalNTH() + "\n" +
                "\tNIS: " + CalNIS() + "\n" +
                "\tEducation Tax: " + CalEduTax() + "\n" +
                "Total Deductions: " + Deductions() + "\n\n" +
                "Net Salary: " + getPaymentAmount() + "\n");
    }

}
