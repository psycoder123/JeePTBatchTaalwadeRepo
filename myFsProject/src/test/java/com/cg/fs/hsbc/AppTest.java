package com.cg.fs.hsbc;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	 App a1 = null;
    public AppTest( )
    {
        super();
    }
	
	@Before
	public void setUp()
	{
		a1 = new App();
		System.out.println("Function for before annotation");
	}
	@Test
	public void testGreetMe()
	{
	Assert.assertEquals("Welcome sample",a1.greetMe());
	}
	
	@After
	public void tearUp()
	{
	 a1=null;
	}
	
}
