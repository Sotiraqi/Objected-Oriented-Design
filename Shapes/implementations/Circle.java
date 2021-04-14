package shapes.implementations;

import shapes.abstractions.IShapeOptions;
import java.util.ArrayList;

public class Circle implements IShapeOptions {

	ArrayList<Circle> totalCircleNumber = new ArrayList<Circle>();
	
	
	@Override
	public void createShape() 
	{
		Circle circle = new Circle();
		totalCircleNumber.add(circle);		
		System.out.println("Circle created!");
	}

	@Override
	public void deleteShape() {
		Circle currentCircle = new Circle();
		totalCircleNumber.add(currentCircle);	
		System.out.println("Circle deleted!");

	}

	@Override
	public void modifyShape() {
		Circle currentCircle = new Circle();
		System.out.println("Circle modified!");
		totalCircleNumber.remove(currentCircle);
		Circle newCircle = new Circle();
		totalCircleNumber.add(newCircle);
	}
	
	@Override
	public void printTotalShapes() {
		System.out.println("The total number of circles is: "+totalCircleNumber.size());
	}

}
