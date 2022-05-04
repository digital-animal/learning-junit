package com.zahid;


public class Circle {
	
	public double computeArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	
	
	public double computeCircumference(double radius) {
		return 2*Math.PI*radius;
	}
}
