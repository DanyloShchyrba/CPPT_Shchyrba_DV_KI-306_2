package KI306.Shchyrba.Lab5;

/**
 * This class represents mathematical equations and provides a method for calculating a result.
 */

public class Equations 
	{
	    /**
	     * Calculate the result of the equation based on the given input X.
	     *
	     * @param x The input value for the equation.
	     * @return The calculated result of the equation.
	     * @throws CalcException If a calculation error occurs, this exception is thrown.
	     */
	    public double calculate(int x) throws CalcException {
	        double y, rad;
	        rad = x * Math.PI / 180.0;
	        try {
	            // Since we are using 1/tan instead of cotan, additional exceptions need to be handled.
	            if (rad == Math.PI / 2.0 || rad == 0.0 || rad == -Math.PI / 2.0 )
	                throw new CalcException();

	            y = Math.tan(2.0 * rad);

	            // If the result is not a valid number, generate an exception.
	            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 45 || x == -45)
	                throw new ArithmeticException();
	        } catch (ArithmeticException ex) {
	            // Create a higher-level exception with an explanation of the error cause.
	            if (rad == Math.PI / 2.0 || rad == 0.0 || rad == -Math.PI / 2.0)
	                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
	            else if (rad == Math.PI / 4.0 || rad == -Math.PI / 4.0)
	                throw new CalcException("Exception reason: Illegal value of X for tangent calculation, which is necessary for finding the cotangent in Java");
	            else
	                throw new CalcException("Unknown reason of the exception during exception calculation");
	        }
	        return y;
	    }
	}

