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
        assertEquals("Returns fizz", "fizz", fizzBuzz.fizzOrBuzzOrLucky(6));
    }

    @Test
    public void shouldReturnLucky() {
        assertEquals("prints lucky if integer contains a 3", "lucky",fizzBuzz.fizzOrBuzzOrLucky(13));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Returns buzz", "buzz", fizzBuzz.fizzOrBuzzOrLucky(5));
    }

    @Test
    public void shouldReturnFizzbuzz() {
        assertEquals("Returns fizzbuzz", "fizzbuzz", fizzBuzz.fizzOrBuzzOrLucky(15));
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals("Returns integer inserted when it is not divisible by 3 or 5", "4", fizzBuzz.fizzOrBuzzOrLucky(4));
    }

    //stringBuilder
    @Test
    public void shouldReturnAStringOfFizzbuzz() {
        assertEquals("Returns a concatenated string result", "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky", fizzBuzz.buildString(13));
    }

    @Test
    public void trimsWhiteSpace() {
        assertNotEquals("String with tailing whitespace","1 2 lucky 4 buzz ", fizzBuzz.buildString(5));
    }

    @Test
    public void shouldReturnCountForFizz() {
        fizzBuzz.buildString(6);
        assertEquals("Should return count of 1 for fizz",1, fizzBuzz.getFizzCount());
    }

    @Test
    public void shouldReturnCountForBuzz() {
        fizzBuzz.buildString(10);
        assertEquals("Should return count of 1 for buzz", 2, fizzBuzz.getBuzzCount());
    }

    @Test
    public void shouldReturnCountForFizzBuzz() {
        fizzBuzz.buildString(45);
        assertEquals("Should return count of 2 for fizzbuzz", 2, fizzBuzz.getFizzBuzzCount());
    }

    @Test
    public void shouldReturnCountLucky() {
        fizzBuzz.buildString(33);
        assertEquals("Should return count of  for lucky", 7, fizzBuzz.getLuckyCount());
    }
//
    @Test
    public void shouldReturnCountInteger() {
        fizzBuzz.buildString(15);
        assertEquals("Should return count of 1 for fizz", 7, fizzBuzz.getIntegerCount());
    }
}
