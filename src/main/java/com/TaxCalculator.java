package com.tax;

public class TaxCalculator {

    public double calculateTax(double income) {

        if (income <= 250000) {
            return 0;
        } 
        else if (income <= 500000) {
            return income * 0.05;
        } 
        else if (income <= 1000000) {
            return income * 0.20;
        } 
        else {
            return income * 0.30;
        }
    }
}