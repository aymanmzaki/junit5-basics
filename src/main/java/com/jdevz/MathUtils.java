package com.jdevz;

public class MathUtils {
	
	private static final double PI=3.141592653589793238; 
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public double calculateCircleArea(double radius) {
		return PI* radius * radius;
	}
	
	public double divide(double a, double b) {
		return a/b;
	}
	
	
}
