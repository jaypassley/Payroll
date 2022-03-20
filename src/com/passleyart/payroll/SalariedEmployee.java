package com.passleyart.payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;
    final double NHT = 0.03;
    final double EduTax = 0.02;
    final double NIS =0.02;

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



    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void display() {
        System.out.println("First Name :" + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Social Security #: " + getSocialSecurityNumber() + "\n" +
                "Gross Salary: " + getWeeklySalary() + "\n" +
                "NHT: " + CalNTH() + "\n" +
                "NIS: " + CalNIS() + "\n" +
                "Education Tax: " + CalEduTax() + "\n" +
                "Total Deductions: " + Deductions() + "\n" +
                "Net Salary: " + getPaymentAmount() + "\n");
    }
}
