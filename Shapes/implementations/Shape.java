package shapes.implementations;

import shapes.abstractions.IShapeOptions;
import java.util.Scanner;

public class Shape implements IShapeOptions {

	Scanner input = new Scanner(System.in);
	public int x, y;
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
		if(o instanceof Shape)
		{
			Shape toCompare = (Shape)o;
			
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getSides() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSide() {
		// TODO Auto-generated method stub
		return 0;
	}

}
