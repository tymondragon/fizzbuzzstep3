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
        System.out.println(result);
        System.out.println("fizz: " + fizzBuzz.getFizzCount());
        System.out.println("buzz: " + fizzBuzz.getBuzzCount());
        System.out.println("fizzBuzz: " + fizzBuzz.getFizzBuzzCount());
        System.out.println("lucky: " + fizzBuzz.getLuckyCount());
        System.out.println("integer: " + fizzBuzz.getIntegerCount());
    }
}

