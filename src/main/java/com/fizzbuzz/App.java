package com.fizzbuzz;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int length = scanner.nextInt();
        scanner.close();
        final String result = fizzBuzz.buildString(length);
        System.out.print(result);
    }
}

