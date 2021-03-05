package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hi World Ping " + i );
			System.out.println("Ceyhun's repository");
			Thread.sleep(1000);
		}
	}
}
