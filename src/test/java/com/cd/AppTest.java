package com.cd;

import org.jenkinsci.testinprogress.runner.ProgressBatchSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.TestCase;

//@RunWith(ProgressBatchSuite.class)
//@BatchTestRunner.BatchTestInclude("**.*Suite")
public class AppTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
    	System.out.println("Executing method 1");
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
	
	@Test
	public void testApp2()
    {
		
		System.out.println("Executing method 2");
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
	@Test
	public void testApp3()
    {
		System.out.println("Executing method 3");
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
