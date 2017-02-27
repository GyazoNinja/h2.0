package squareRoot;

public class Recursion {

	public double method(double input, double error, double guess){
	//if statement to check if guess squared minus the input is less than the error.
	//if it is less than the input, than the recursion is finished and the final guess is returned.	
		if ((guess * guess - input) <= error){
			return guess;
	}
	//recursive method to make the guess more and more accurate
	//input and error never change
	//the new guess being used in each new recursion is equal to
	// 0.5 *(last guess + X / last guess)
	//keeps going until the if statement above is satistfied.
		return method(input, error, .5 * (guess + input/guess)); 
		}
	
	//constructor for the babylonian method to be able to be used in the print method in the main
	public Recursion(){}
}
