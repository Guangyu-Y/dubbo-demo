package com.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider 
{
    public static void main( String[] args ) throws IOException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "provider.xml" });
		context.start();
		System.out.println("yeah");
		System.in.read(); 
    }
}
