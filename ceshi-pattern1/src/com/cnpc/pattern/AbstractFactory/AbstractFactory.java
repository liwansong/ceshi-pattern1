package com.cnpc.pattern.AbstractFactory;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
	void sleep() {
	   System.out.println("躺着");
	 }

}
