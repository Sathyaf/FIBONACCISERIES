package com.fibser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FibonacciSeriesTest 
{
    private FibonacciSeries fibonacci;

    @Before
    public void setUp(){
        fibonacci=new FibonacciSeries();       
    }

    
    @Test
    public void find_1()
    {
        int testno = 1;
        long expected[] = {0};
        assertArrayEquals(expected,fibonacci.find(testno));
    }

    @Test
    public void find_2()
    {
        int testno = 2;
        long expected[] = {0,1};
        assertArrayEquals( expected , fibonacci.find(testno) );
    }

    @Test
    public void find_5()
    {
        int testno = 5;
        long expected[] = {0,1,1,2,3};
        assertArrayEquals( expected , fibonacci.find(testno) );
    }

    @Test
    public void find_9()
    {
        int testno = 9;
        long expected[] = {0,1,1,2,3,5,8,13,21};
        assertArrayEquals( expected , fibonacci.find(testno) );
    }

    @Test(expected=NegativeArraySizeException.class)
    public void testException()
    {
        int limit = -1;
        fibonacci.find(limit);
    }

    


}
