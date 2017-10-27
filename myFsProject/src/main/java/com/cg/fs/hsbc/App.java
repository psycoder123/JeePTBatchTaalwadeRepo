package com.cg.fs.hsbc;

/**
 * Hello world!
 *
 */
public class App 
{
    String name ="sample";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public String greetMe()
	{
	 return "Welcome "+name;
	}
	
	public int add(int a,int b){
	System.out.println( "Addition of two number :"+(a+b) );
	return (a+b);
	}
}
