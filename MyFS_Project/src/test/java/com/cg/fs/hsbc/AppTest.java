package com.cg.fs.hsbc;

import org.junit.*;

public class AppTest 
  
{
	App e1=null;
	public AppTest()
	{
	 super();
	}
	@Before
	public void setUp()
	{
	e1=new App();
	System.out.println("Function for before annotation");
	}
	@Test
	public void testGreetMe()
	{
	Assert.assertEquals("Welcome Birdar",e1.greetMe());
	}
	@After
	public void tearUp()
	{
	
	}
    
}
