package com.king.assignment1;

import java.text.DecimalFormat;

/**
 * Abstract class for division calculations
 * @author Jared King
 */
public abstract class Division {

	/**
	 * Returns the quotient of two ints
	 * @param x the first value
	 * @param y the second value
	 * @return the quotient
	 */
	public double calculate(int x, int y) {
		return (double) x / y;
	}
	
	/**
	 * Returns the quotient of two doubles
	 * @param x the first value
	 * @param y the second value
	 * @return the quotient
	 */
	public double calculate(double x, double y) {
		return x / y;
	}
	
	 public String format(double value, int decPlaces) {
			
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
