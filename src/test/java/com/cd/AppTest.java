package com.cd;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("Executing method 1");
        assertTrue( true );
	try
	{
	    Thread.sleep(30000);
	    System.out.println("Successfully executed  method 1");
	}
	catch(InterruptedException ex)
	{
	    Thread.currentThread().interrupt();
	}
    }
	
	public void testApp2()
    {
		
		System.out.println("Executing method 2");
        assertTrue( true );
	try
	{
	    Thread.sleep(30000);
	    System.out.println("Successfully executed  method 2");
	}
	catch(InterruptedException ex)
	{
	    Thread.currentThread().interrupt();
	}
	
    }
	public void testApp3()
    {
		System.out.println("Executing method 3");
        assertTrue( true );
	try
	{
	    Thread.sleep(30000);
	    System.out.println("Successfully executed  method 3");
	}
	catch(InterruptedException ex)
	{
	    Thread.currentThread().interrupt();
	}
    }
}
