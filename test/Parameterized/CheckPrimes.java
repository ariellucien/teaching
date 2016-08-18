/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameterized;

import helpers.PrimeNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author administrador1
 */
@RunWith(Parameterized.class)
public class CheckPrimes {
    private Integer input;
    private Boolean expected;
    private PrimeNumbers primeChecker;
    
    @Before
    public void initalize()
    {
        primeChecker = new PrimeNumbers();
    }
   
    public CheckPrimes(Integer input, Boolean expected) 
    {
        this.input = input;
        this.expected = expected;                
    }
    
    @Parameters
    public static Collection primeNumbersList()
    {
        return Arrays.asList(new Object[][]{
            {2,true},
            {6,false},
            {19,true},
            {22,false},
            {23,true},
            
        });
    }
    
    @Test
    public void testPrimeNumbers()
    {
        System.out.println("Parameterized number is: " + input);
        assertEquals(expected, primeChecker.isPrime(input));
    }
}
