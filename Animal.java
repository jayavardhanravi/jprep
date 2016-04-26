/**
 * Name of the file must match the name of the class.
 * And the class containing the main method must be public. 
 * The code is compiled using "javac filename.java"
 * The compiler creates a bytecode file with extension ".class".
 * While executing the ".class" file we don't use the extension of the filename
 * as the "."(period) has the reserved meaning in the JVM. So the file is executed as
 * "java filename".
 */
public class Animal 
{
	/**
	 * The main method syntax must be the same below :
	 * "public static void main(String[] args)"
	 * we cannot change the return type or the access specifier
	 * if changed the code compiles but doesn't execute.
	 * Throws error as :
	 * -------------------------------------------------------------------------------
	 * Error: Main method not found in class Animal, please define the main method as:
	 * public static void main(String[] args)
	 * or a JavaFX application class must extend javafx.application.Application
	 * -------------------------------------------------------------------------------
	 * 
	 * public - Access modifier( Specifies the level of exposure).
	 * static - It binds a method to it's class, so it can be called just by the class name.
	 * void - Return Type( It means it returns nothing). This is used for main() because it just changes the 
	 * 			state from start to finish and doesn't return anything.
	 * String[] variables - Array of java.lang.String Objects (Method parameter)
	 * 			This can also be written as:
	 * 				String  args[];(Fixed array with same types)
	 * 				String... args;(variables arguments list)
	 * 
	 */
	public static void main(String[] varb)
	{
		System.out.println("Main methon execution started!!!");
		System.out.println(varb[0]);
		/**
		 * Arguments are seperated by spaces.
		 * Use quotes if the arguments needs to have spaces.
		 * If the sufficient number of arguments are not given then the following error occurs:
		 * -----------------------------------------------------------------------
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
		 * at Animal.main(Animal.java:38)
		 * -----------------------------------------------------------------------
		 */
		System.out.println(varb[1]);
	}
}
