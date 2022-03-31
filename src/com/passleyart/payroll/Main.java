package com.passleyart.payroll;

/* Group members: Nashorn Passley 1400162306
                  Latona Levy 1917010761
                  Ramon Francis 1400137487
                          */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //NB: To test each object and their respective codes separately
        // the others have to be commented out.

       // Invoice INV = new Invoice();
        // SalariedEmployee SE = new SalariedEmployee();
        //HourlyEmployee HE = new HourlyEmployee();
        //CommissionEmployee CE = new CommissionEmployee();
        BasePlusCommissionEmployee BCE = new BasePlusCommissionEmployee();


//        //Enter input for Invoice
//        System.out.println("\nEnter Invoice Details\n**********************\n");
//
//        System.out.println("Enter Parts Number");
//        INV.setPartNumber(sc.next());
//
//        System.out.println("Enter Parts Description");
//        INV.setPartDescription(sc.next());
//
//        System.out.println("Enter Quantity");
//        INV.setQuantity(sc.nextInt());
//
//        System.out.println("Enter Price of Item");
//        INV.setPricePerItem(sc.nextDouble());
//
//        INV.writeToFile();
//
//        //Display Invoice info
//        System.out.println("\n\t\t  --Invoice Data--\n");
//        INV.display();

        //************************************************
        //************************************************

//        //Enter input for Salaried Employee
//        System.out.println("\nEnter Payroll Info For a Salaried Employee\n******************************************\n");
//
//        System.out.println("Enter First Name");
//
//        SE.setFirstName(sc.next());
//
//        System.out.println("Enter Last Name");
//        SE.setLastName(sc.next());
//
//        System.out.println("Enter Social Security #");
//        SE.setSocialSecurityNumber(sc.next());
//
//        System.out.println("Enter Weekly Salary");
//        SE.setWeeklySalary(sc.nextDouble());
//
//        SE.writeToFile();
//
//        //Display Salaried Employee info
//        System.out.println("\n--Salaried Employee Info--\n");
//        SE.display();

        //************************************************
        //************************************************

//        //Enter input for Hourly Employee
//        System.out.println("\nEnter Payroll Info For an Hourly Employee\n******************************************\n");
//
//        System.out.println("Enter First Name");
//
//        HE.setFirstName(sc.next());
//
//        System.out.println("Enter Last Name");
//        HE.setLastName(sc.next());
//
//        System.out.println("Enter Social Security #");
//        HE.setSocialSecurityNumber(sc.next());
//
//        System.out.println("Enter Hourly Wage");
//        HE.setWage(sc.nextDouble());
//
//        System.out.println("Enter Hours Worked");
//        HE.setHours(sc.nextDouble());
//
//        HE.writeToFile();
//
//        //Display Salaried Employee info
//        System.out.println("\n--Salaried Employee Info--\n");
//        HE.display();

//        //************************************************
//        //************************************************
//
//        //Enter input for Commission Employee
//        System.out.println("\nEnter Payroll Info For a Commission Employee\n******************************************\n");
//
//        System.out.println("Enter First Name");
//
//        CE.setFirstName(sc.next());
//
//        System.out.println("Enter Last Name");
//        CE.setLastName(sc.next());
//
//        System.out.println("Enter Social Security #");
//        CE.setSocialSecurityNumber(sc.next());
//
//        System.out.println("Enter Gross Sales");
//        CE.setGrossSale(sc.nextDouble());
//
//        System.out.println("Enter Commission Rate");
//        CE.setCommissionRate(sc.nextDouble());
//
//        CE.writeToFile();
//
//        //Display Salaried Employee info
//        System.out.println("\n--Salaried Employee Info--\n");
//        CE.display();

        //************************************************
        //************************************************

        //Enter input for Base plus Commission Employee
        System.out.println("\nEnter Payroll Info For a Base + Commission Employee\n******************************************\n");

        System.out.println("Enter First Name");

        BCE.setFirstName(sc.next());

        System.out.println("Enter Last Name");
        BCE.setLastName(sc.next());

        System.out.println("Enter Social Security #");
        BCE.setSocialSecurityNumber(sc.next());

        System.out.println("Enter Base Salary Sales");
        BCE.setBaseSalary(sc.nextDouble());

        System.out.println("Enter Gross Sales");
        BCE.setGrossSale(sc.nextDouble());

        System.out.println("Enter Commission Rate");
        BCE.setCommissionRate(sc.nextDouble());

        BCE.writeToFile();

        //Display Salaried Employee info
        System.out.println("\n--Salaried Employee Info--\n");
        BCE.display();
    }
}