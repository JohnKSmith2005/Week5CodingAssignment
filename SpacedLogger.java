package week5CodingProject;

//3. Create two classes that implement the Logger interface
//	a. AsteriskLogger
//	b. SpacedLogger

public class SpacedLogger implements Logger {

//6. The SpacedLogger should add spaces between each character of the String argument passed into its methods.

	
	public void log(String log) {

//7. If the log method received “Hello” as an argument, it should print H e l l o
		
		System.out.println(log.replace("", " ").trim());
	}

	public void error(String error) {

//8. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
		
		error.replace(""," ").trim();
		System.out.println("ERROR: " + error.replace("", " ").trim());
		
	}

}
