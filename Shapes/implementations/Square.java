package shapes.implementations;

import java.util.Scanner;

public class Square extends Shape{
	Scanner input = new Scanner(System.in);
	int side;
		
	public int getSide()
	{
		System.out.println("Enter the side: ");
		side = input.nextInt();
		return side;
	}
	
	@Override
	public void getAllDetails()
	{
		getX();
		getY();
		getSide();
		getColor();
	}
	
	@Override
	public void printShapes() {
		System.out.println("This is a square with center at X: "+x+" Y: "+y+" Color: "+color+" Side: "+side);		
	}

}
