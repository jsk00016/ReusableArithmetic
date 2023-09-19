package com.king.assignment1;

/**
 * Abstract class for addition calculations
 * @author Jared King
 */
public abstract class Addition implements BasicArithmetic {
	
	/**
	 * Returns the sum of two ints
	 */
	@Override
	public int calculate(int x, int y) {
		return x + y;
	}
	
	/**
	 * Returns the sum of two doubles
	 */
	@Override
	public double calculate(double x, double y) {
		return x + y;
	}

}
