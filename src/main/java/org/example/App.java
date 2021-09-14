package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Press C to convert from farenheit to celsius. \nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        if(input.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            float Fahrenheit = Float.parseFloat(sc.nextLine());
            float celsius = (Fahrenheit - 32) * (5/9);
            System.out.printf("The temperature in Celsius is %.0f", celsius);
        }else if(input.equals("F")){
            System.out.println("Please enter the temperature in celsius: ");
            float celsius = Float.parseFloat(sc.nextLine());
            float Fahrenheit = (celsius *(9/5))+32;
            System.out.printf("The temperature in Fahrenheit is %.0f", Fahrenheit);
        }else{
        System.out.println("Invalid input!");
    }


    }
}
