package org.fmartins.jwhats.main;

import org.fmartins.jwhats.registration.CodeRequest;

/**
 * Main class os application
 *
 */
public class MainClass 
{
	public static void main( String[] args )
	{
		CodeRequest req = new CodeRequest();
		req.getCode("55", "558587971539");
	}
}
