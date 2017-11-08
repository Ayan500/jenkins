package com.avekshaa;

import java.io.IOException;
import java.util.Base64;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {	
    	String s1="1";
    	byte[] signatures = s1.getBytes();
    	System.out.println();
    	String signatureAsString = net.iharder.Base64.encodeBytes(signatures);     
    	System.out.println( "SecretKey=   "+signatureAsString);
    	byte[] sig = net.iharder.Base64.decode(signatureAsString);
    	System.out.println("sig =    "+sig);
    	
    }
}
