package week5CodingProject;

//	3. Create two classes that implement the Logger interface
//		a. AsteriskLogger
//		b. SpacedLogger

public class AsteriskLogger implements Logger {

	
//	4. The log method on the AsteriskLogger should print out the String it receives between 
//		3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, 
//		then it should print ***Hello*** to the console.
	
		
	public void log(String log) {

		
		System.out.println("***" + log + "***");
		
		
	}
	
	
//	5. The error method on the AsteriskLogger should print the String it receives inside a box 
//	   of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is 
//	   the argument, the following should be printed:
			

	public void error(String error) {
		
		//prints 13 asterisks to account for amount of characters on second line, then adds asterisks equal to length of string given.
		
		System.out.print("*************");
		for (int i =0; i < error.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		System.out.print(""
				+ "***Error: " + error + "***");
		System.out.println();
	
		System.out.print("*************");
		for (int i =0; i < error.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}


	
	
}
