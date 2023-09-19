package com.king.assignment1;

import java.text.DecimalFormat;

/**
 * Base Interface to be implemented by Abstract classes which define behavior for each type of calculation
 * @author Jared King
 */
public interface BasicArithmetic {

	/**
	 * Method to perform calculation with two ints
	 * @param x the first value
	 * @param y the second value
	 * @return the calculated value
	 */
	int calculate (int x, int y);
	
	/**
	 * Method to perform calculation with two doubles
	 * @param x the first value
	 * @param y the second value
	 * @return the calculated value
	 */
	double calculate (double x, double y);
	
	/**
	 * Format (and round) a double to the given number of decimal places
	 * @param value the number to be formatted
	 * @param decPlaces the number of decimal places to keep
	 * @return the formatted double in String format
	 */
	 default String format(double value, int decPlaces) {
		
		// Creating a pattern to input into DecimalFormat 
		String pattern;
		if (decPlaces <= 0) {
			pattern = "#";
		}
		else {
			pattern = "#.";
			for (int i = 0; i < decPlaces; i++) {
				pattern = pattern + "#";
			}
		}
		
		DecimalFormat df = new DecimalFormat(pattern);
		
		return df.format(value);
	}
}
