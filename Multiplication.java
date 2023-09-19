package com.king.assignment1;

/**
 * Abstract class for multiplication calculations
 * @author Jared King
 */
public abstract class Multiplication implements BasicArithmetic {
	
	/**
	 * Returns the product of two ints
	 */
	@Override
	public int calculate(int x, int y) {
		return x * y;
	}

	/**
	 * Returns the product of two doubles
	 */
	@Override
	public double calculate(double x, double y) {
		return x * y;
	}

}
