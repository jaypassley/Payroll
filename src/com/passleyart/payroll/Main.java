package com.passleyart.payroll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SalariedEmployee SE = new SalariedEmployee();

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


        //Display Manger info
        System.out.println("\nSalaried Employee Info\n");
        SE.display();
}
}