package trianglePlugin;

import graphicappwithplugins.abstractions.IShape;
import java.util.Scanner;

public class Triangle implements IShape{

	Scanner input = new Scanner(System.in);
	public int x, y, s1, s2, s3;
	public String color;
	
	public void getSides()
	{
		System.out.println("Enter first side length: ");
		s1 = input.nextInt();
		System.out.println("Enter second side length: ");
		s2 = input.nextInt();
		System.out.println("Enter third side length: ");
		s3 = input.nextInt();
		
		if(s1 + s2 < s3 || s1 + s3 < s2 || s2 + s3 < s1)
		{
			System.out.println("The triangle cannot exist! Input data again!");
			getSides();
		}
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
		getSides();		
	}

	@Override
	public void printShape() {
		System.out.println("Triangle \t "+x+" \t "+y+" \t "+color+" \t "+s1+", "+s2+", "+s3);		
	}	

}
