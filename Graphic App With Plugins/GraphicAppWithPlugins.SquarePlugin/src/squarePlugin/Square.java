package squarePlugin;

import java.util.Scanner;

import graphicappwithplugins.abstractions.IShape;

public class Square implements IShape{

	Scanner input = new Scanner(System.in);
	public int x, y, side;
	public String color;	
	
	public int getSide() {		
		System.out.println("Enter radius: ");
		side = input.nextInt();
		return side;
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
		getSide();		
	}

	@Override
	public void printShape() {
		System.out.println("Circle \t "+x+" \t "+y+" \t "+color+" \t "+side);		
	}

}
