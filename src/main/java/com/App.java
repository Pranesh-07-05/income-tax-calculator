package com.tax;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Income: ");

        double income = sc.nextDouble();

        TaxCalculator calculator = new TaxCalculator();

        double tax = calculator.calculateTax(income);

        System.out.println("Calculated Tax = ₹" + tax);

        sc.close();
    }
}