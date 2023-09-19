package com.king.assignment1test;

import java.util.Random;

import com.king.assignment1.Addition;
import com.king.assignment1.Division;
import com.king.assignment1.Multiplication;
import com.king.assignment1.Subtraction;

public class Testing {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt();
		int j = r.nextInt();
		double x = r.nextDouble();
		double y = r.nextDouble();
		
		// Addition
		AdditionTest at = new AdditionTest();
		System.out.println(i + " + " + j + " = " + at.calculate(i, j));
		System.out.println(x + " + " + y + " = " + at.calculate(x, y));
		
		// Subtraction
		SubtractionTest st = new SubtractionTest();
		System.out.println(i + " - " + j + " = " + st.calculate(i, j));
		System.out.println(x + " - " + y + " = " + st.calculate(x, y));
		
		// Multiplication
		MultiplicationTest mt = new MultiplicationTest();
		System.out.println(i + " * " + j + " = " + mt.calculate(i, j));
		System.out.println(x + " * " + y + " = " + mt.calculate(x, y));
		
		// Division
		DivisionTest dt = new DivisionTest();
		System.out.println(i + " / " + j + " = " + dt.calculate(i, j));
		System.out.println(x + " / " + y + " = " + dt.calculate(x, y));
		
		// Format
		System.out.println("Formatting Pi to 3 decimals: " + at.format(Math.PI, 3));
		System.out.println("Formatting Pi to 0 decimals: " + dt.format(Math.PI, 0));
		
	}
	
	// Create testing versions of each abstract class
	static class AdditionTest extends Addition  {
	}
	static class SubtractionTest extends Subtraction {
	}
	static class MultiplicationTest extends Multiplication {
	}
	static class DivisionTest extends Division {
	}
}