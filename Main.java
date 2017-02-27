package squareRoot;
import java.util.*;
public class Main {

public static void main(String []args){
	// constructor for the babylonian method, created so that the print statement works
	Recursion babylonian = new Recursion();
	// create doubles to be used in babylonian method, user input and user error
	double input, error;

	//scanners and following print statements
	//tells the user how to input a number for the input and error
	Scanner userInput = new Scanner(System.in);
	System.out.print("In the console, put your input and hit enter.");
	input = userInput.nextDouble();
	System.out.print("In the console, put your error and hit enter.");
	error = userInput.nextDouble();
	//once the user puts in their inputs, 
	//the program calculates the guess based on the input and returns it
	System.out.print("The Babylonian method guesses... ");
	System.out.print(babylonian.method(input, error, input / 2));
	System.out.print("!");
	//
	



}
}