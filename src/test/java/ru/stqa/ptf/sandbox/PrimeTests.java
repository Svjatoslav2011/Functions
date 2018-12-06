package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Primes;

public class PrimeTests {

    @Test
    public void testPrime() {
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }



    @Test
    public void testNonPrime() {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE-2));
    }

    @Test(enabled = false)
    public void testPrimeLong() {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }
}
