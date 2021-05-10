package circlePlugin;

import graphicappwithplugins.abstractions.IShape;
import java.util.Scanner;

public class Circle implements IShape{
	
	Scanner input = new Scanner(System.in);
	public int x, y, radius;
	public String color;	
	
	public int getRadius() {		
		System.out.println("Enter radius: ");
		radius = input.nextInt();
		return radius;
	}
	
	@Override
	public int getX() {
		System.out.println("Enter x: ");
		x = input.nextInt();
		return x;
	}

	@Override
	public int getY() {
		System.out.println("Enter y: ");
		y = input.nextInt();
		return y;
	}

	@Override
	public String getColor() {
		input.nextLine();
		System.out.println("Insert the color: ");
		color = input.nextLine();
		return color;
	}

	@Override
	public void getAllDetails() {
		getX();
		getY();
		getColor();
		getRadius();		
	}

	@Override
	public void printShape() {
		System.out.println("Circle \t "+x+" \t "+y+" \t "+color+" \t "+radius);		
	}

}
