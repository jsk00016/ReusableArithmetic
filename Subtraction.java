package com.king.assignment1;

/**
 * Abstract class for subtraction calculations
 * @author Jared King
 */
public abstract class Subtraction implements BasicArithmetic{
	
	/**
	 * Returns the difference of two ints
	 */
	@Override
	public int calculate(int x, int y) {
		return x - y;
	}
	
	/**
	 * Returns the difference of two doubles
	 */
	@Override
	public double calculate(double x, double y) {
		return x - y;
	}
}
