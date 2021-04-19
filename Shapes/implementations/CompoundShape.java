package shapes.implementations;

import java.util.Scanner;

import shapes.abstractions.IShapeOptions;

public class CompoundShape implements IShapeOptions {

	Scanner input = new Scanner(System.in);
	public int x, y, s1, s2, s3, es1, es2, radius, side;
	public String color;
			
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
	public boolean equals(Object o)
	{
		if(o instanceof CompoundShape)
		{
			CompoundShape toCompare = (CompoundShape)o;
			
			if(toCompare.x == (this.x) || toCompare.y == (this.y))
			{
				return true;
			}
				
		}
		return false;		
	}

	@Override
	public void printShapes() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getAllDetails() {
		// TODO Auto-generated method stub		
	}

	@Override
	public int getRadius() {
		System.out.println("Enter the radius: ");
		radius = input.nextInt();
		return radius;
	}

	@Override
	public int getLength() {
		System.out.println("Enter the length of equilateral: ");
		es1 = input.nextInt();
		return es1;
	}

	@Override
	public int getWidth() {
		System.out.println("Enter the width of equilateral: ");
		es2 = input.nextInt();
		return es2;
	}

	@Override
	public void getSides() {
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
	public int getSide() {
		System.out.println("Enter the side: ");
		side = input.nextInt();
		return side;
	
	}

}
