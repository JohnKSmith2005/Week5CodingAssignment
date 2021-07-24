package week5CodingProject;

//9.  Create a class named App that has a main method.
//10. In this class instantiate an instance of each of your logger classes that implement the Logger interface.

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		//Tests for AsteriskLogger
		
		System.out.println("Tests for AsteriskLogger:");
		System.out.println();
		logger.log("Hello");
		logger.log("This adds three asterisks to each side of my text");
		logger.log("supercalifragilisticexpialidocious");
				
		System.out.println();
		
		logger.error("Hello");
		logger.error("This creates a box around my text");
		logger.error("supercalifragilisticexpialidocious");
		
		System.out.println();

		Logger logger2 = new SpacedLogger();
		
		//Tests for SpacedLogger
		
		System.out.println("Tests for SpacedLogger:");
		System.out.println();
		logger2.log("Hello");
		logger2.log("This puts a space after each letter in my text");
		logger2.log("supercalifragilisticexpialidocious");
		
		System.out.println();
		
		logger2.error("Hello");
		logger2.error("This puts a space after each letter in my text, while adding error before the text");
		logger2.error("supercalifragilisticexpialidocious");

	}

}
