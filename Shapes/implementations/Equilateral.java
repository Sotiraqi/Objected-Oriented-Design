package shapes.implementations;

import java.util.Scanner;

public class Equilateral extends Shape{
	Scanner input = new Scanner(System.in);
	int s1, s2;
	
	@Override
	public int getLength()
	{
		System.out.println("Enter the length of equilateral: ");
		s1 = input.nextInt();
		return s1;
	}
	
	@Override
	public int getWidth()
	{
		System.out.println("Enter the width of equilateral: ");
		s2 = input.nextInt();
		return s2;
	}
	
	
	@Override
	public void getAllDetails()
	{
		getX();
		getY();
		getLength();
		getWidth();
		getColor();
	}
	
	@Override
	public void printShapes() {
		System.out.println("This is a equilateral with center at X: "+x+" Y: "+y+" Color: "+color+" Length: "+s1+" Width: "+s2);		
	}
	
	

}
