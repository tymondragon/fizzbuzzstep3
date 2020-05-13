package com.fizzbuzz;

public class FizzBuzz
{
    private int fizz;
    private int buzz;
    private int fizzBuzz;
    private int lucky;
    private int integer;

    public FizzBuzz() {
        this.fizz = 0;
        this.buzz = 0;
        this.fizzBuzz = 0;
        this.lucky = 0;
        this.integer = 0;
    }

    public String fizzOrBuzzOrLucky(int indexedNumber) {
        String value;
        if (Integer.toString(indexedNumber).contains("3")) {
            value = "lucky";
            this.lucky++;
        }
        else if (indexedNumber % 3 == 0 && indexedNumber % 5 == 0) {
            value = "fizzbuzz";
            this.fizzBuzz++;
        }
        else if (indexedNumber % 3 == 0) {
            value = "fizz";
            this.fizz++;
        }
        else if (indexedNumber % 5 ==0) {
            value = "buzz";
            this.buzz++;
        }
        else {
            value = Integer.toString(indexedNumber);
            this.integer++;
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

    public int getFizzCount() {
        return fizz;
    }
    public int getBuzzCount() {
        return buzz;
    }
    public int getFizzBuzzCount() {
        return fizzBuzz;
    }
    public int getLuckyCount() {
        return lucky;
    }
    public int getIntegerCount() {
        return integer;
    }
}
