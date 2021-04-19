package shapes.implementations;

import java.util.Scanner;

public class Circle extends Shape
{
	Scanner input = new Scanner(System.in);
	int radius;
		
	public int getRadius()
	{
		System.out.println("Enter the radius: ");
		radius = input.nextInt();
		return radius;
	}
	
	@Override
	public void getAllDetails()
	{
		getX();
		getY();
		getRadius();
		getColor();
	}
	
	@Override
	public void printShapes() {
		System.out.println("This is a circle with center at X: "+x+" Y: "+y+" Color: "+color+" Radius: "+radius);		
	}
	
}
