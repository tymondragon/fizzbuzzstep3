package com.fizzbuzz;

public class FizzBuzz
{
    private int fizz;

    public FizzBuzz() {
        this.fizz = 0;
    }

    public String fizzOrBuzzOrLucky(int indexedNumber) {
        String value;
        if (Integer.toString(indexedNumber).contains("3")) {
            value = "lucky";
        }
        else if (indexedNumber % 3 == 0 && indexedNumber % 5 == 0) {
            value = "fizzbuzz";
        }
        else if (indexedNumber % 3 == 0) {
            value = "fizz";
            this.fizz++;
        }
        else if (indexedNumber % 5 ==0) {
            value = "buzz";
        }
        else {
            value = Integer.toString(indexedNumber);
        }
        return value;
    }

    public String buildString(int number) {
        StringBuilder fizzBuzzString = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            fizzBuzzString.append(fizzOrBuzzOrLucky(i)).append(" ");
        }
        return fizzBuzzString.toString().trim();
    }

    public int getFizz() {
        return fizz;
    }
}
