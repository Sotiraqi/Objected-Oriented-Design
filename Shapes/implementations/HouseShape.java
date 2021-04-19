package shapes.implementations;

public class HouseShape extends CompoundShape{
	
	//Consists of a shape that resembles a house (A square and a triangle above)
	
	@Override
	public void getAllDetails()
	{
		getX();
		getY();
		getSide();
		getSides();
		getColor();
	}
	
	@Override
	public void printShapes() {
		System.out.println("This is a house with center at X: "+x+" Y: "+y+" compound from a square with side: "+side+", a triangle with sides: "+s1+", "+s2+", "+s3+" and colored"+color);		
	}

}
