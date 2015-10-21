/**
 * 
 */
package com.example.liquorpricecalculator;

/**
 * @author Jack
 *
 */
public class PriceCalculator {
	public static double calcPrice(double base, double size)
	{
		double result =1.205*base + size*3.7708/1000; 
		result *= 100;
		result = Math.round(result);
		result /= 100;
		return result;
	}
}
