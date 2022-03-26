package com.passleyart.payroll;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        LocalDate now = LocalDate.now();
//        System.out.println(dtf.format(now));


        Scanner sc = new Scanner(System.in);

        Invoice INV = new Invoice();
        SalariedEmployee SE = new SalariedEmployee();


        //Enter input for Invoice
        System.out.println("\nEnter Payroll Info For an Invoice\n******************************************\n");

        System.out.println("Enter Parts Number");
        INV.setPartNumber(sc.next());

        System.out.println("Enter Parts Description");
        INV.setPartDescription(sc.next());

        System.out.println("Enter Quantity");
        INV.setQuantity(sc.nextInt());

        System.out.println("Enter Price of Item");
        INV.setPricePerItem(sc.nextDouble());

        INV.writeToFile();

        //Display Invoice info
        System.out.println("\n--Invoice Data--\n");
        INV.display();

        //************************************************
        //************************************************

        //Enter input for Salaried Employee
        System.out.println("\nEnter Payroll Info For a Salaried Employee\n******************************************\n");

        System.out.println("Enter First Name");

        SE.setFirstName(sc.next());

        System.out.println("Enter Last Name");
        SE.setLastName(sc.next());

        System.out.println("Enter Social Security #");
        SE.setSocialSecurityNumber(sc.next());

        System.out.println("Enter Weekly Salary");
        SE.setWeeklySalary(sc.nextDouble());


        //Display Salaried Employee info
        System.out.println("\n--Salaried Employee Info--\n");
        SE.display();
    }
}