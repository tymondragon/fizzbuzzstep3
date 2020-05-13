package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Returns fizz", fizzBuzz.fizzOrBuzzOrLucky(6), "fizz");
    }

    @Test
    public void shouldReturnLucky() {
        assertEquals("prints lucky if integer contains a 3", fizzBuzz.fizzOrBuzzOrLucky(13), "lucky");
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Returns buzz", fizzBuzz.fizzOrBuzzOrLucky(5), "buzz");
    }

    @Test
    public void shouldReturnFizzbuzz() {
        assertEquals("Returns fizzbuzz", fizzBuzz.fizzOrBuzzOrLucky(15), "fizzbuzz");
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals("Returns integer inserted when it is not divisible by 3 or 5", fizzBuzz.fizzOrBuzzOrLucky(4), "4");
    }

    //stringBuilder
    @Test
    public void shouldReturnAStringOfFizzbuzz() {
        assertEquals("Returns a concatenated string result", fizzBuzz.buildString(13), "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky");
    }

    @Test
    public void trimsWhiteSpace() {
        assertNotEquals("String with tailing whitespace", fizzBuzz.buildString(5), "1 2 lucky 4 buzz ");
    }

    @Test
    public void shouldReturnCountForFizz() {
        fizzBuzz.fizzOrBuzzOrLucky(6);
        assertEquals("Should return count of 1 for fizz", fizzBuzz.getFizz(), 1);
    }
}
