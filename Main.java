package squareRoot;
import java.util.*;
public class Main {

public static void main(String []args){
	Recursion babylonian = new Recursion();
	// create doubles to be used in babylonian method
	double input, error;

	Scanner userInput = new Scanner(System.in);
	System.out.print("In the console, put your input and hit enter.");
	input = userInput.nextDouble();
	System.out.print("In the console, put your error and hit enter.");
	error = userInput.nextDouble();
	
	//
	
	System.out.print(babylonian.method(input, error, input / 2));


}
}