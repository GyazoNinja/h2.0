package squareRoot;

public class Recursion {

	public double method(double input, double error, double guess){
	if ((guess * guess - input) <= error){
		return guess;
	}
	return method(input, error, .5 * (guess + input/guess)); 
	}
	
	public Recursion(){}
}
