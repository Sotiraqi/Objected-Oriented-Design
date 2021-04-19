package shapes.implementations;

import java.util.Scanner;

public class Triangle extends Shape
{
	Scanner input = new Scanner(System.in);
	int s1, s2, s3;
	
	@Override
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
	public void getAllDetails()
	{
		getX();
		getY();
		getSides();
		getColor();
	}
	
	@Override
	public void printShapes() {
		System.out.println("This is a triangle with center at X: "+x+" Y: "+y+" Color: "+color+" Sides: "+s1+", "+s2+", "+s3);		
	}
}
