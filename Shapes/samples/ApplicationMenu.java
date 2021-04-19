package shapes.samples;

import java.util.*;
import shapes.abstractions.IMenuItem;
import shapes.implementations.*;

public class ApplicationMenu
{

	private Menu mainMenu = null;
	
	
	public void load()
    {
        //Menu Lists
		ArrayList<IMenuItem> menuItems = new ArrayList<IMenuItem>();
		ArrayList<IMenuItem> showShapeOptions = new ArrayList<IMenuItem>();
		ArrayList<Shape> allShapesList = new ArrayList<Shape>();
		ArrayList<CompoundShape> allCompoundShapesList = new ArrayList<CompoundShape>();
		
		IMenuItem currentItem;
		int shortcut = 1;
				
		//Adding a shape
		showShapeOptions.add(new MenuItem("Circle", 1, (parameters) -> {
			Shape shp = new Circle();
			shp.getAllDetails();
			allShapesList.add(shp);
        }));
	   
		showShapeOptions.add(new MenuItem("Triangle", 2, (parameters) -> {
			  
			Shape trng = new Triangle();
			trng.getAllDetails();
			allShapesList.add(trng);
				
	    }));
		
		showShapeOptions.add(new MenuItem("Equilateral", 3, (parameters) -> {
			  
	        Shape eqt = new Equilateral();
	        eqt.getAllDetails();
	        allShapesList.add(eqt);
				
        }));
		
		showShapeOptions.add(new MenuItem("Square", 4, (parameters) -> {
			  
	       	Shape sqr = new Square();
	       	sqr.getAllDetails();
	       	allShapesList.add(sqr);
        }));
		
		showShapeOptions.add(new MenuItem("House", 5, (parameters) -> {
			  
	       	CompoundShape cpsh = new HouseShape();
	       	cpsh.getAllDetails();
	       	allCompoundShapesList.add(cpsh);
        }));
	   
        currentItem = new Menu("Insert a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
        showShapeOptions.removeAll(showShapeOptions);
        
        //Removing a shape menu        
        Shape toBeRemoved = new Shape();
        CompoundShape toBeRemovedCS = new CompoundShape();
        
        
        showShapeOptions.add(new MenuItem("Simple Shape", 1, (parameters) -> {
        	System.out.println("Enter the coordinates of the respective shape you would like to be removed:");
			toBeRemoved.getX();
			toBeRemoved.getY();
			
			if(allShapesList.contains(toBeRemoved))
			{
				allShapesList.remove(toBeRemoved);
				System.out.println("Shape removed successfully!");
			}
			else
			{
				System.out.println("Shape not found!");
			}
        	
        }));
        
        showShapeOptions.add(new MenuItem ("Compound Shape", 2, (parameters) -> {
        	System.out.println("Enter the coordinates of the respective shape you would like to be removed:");
			toBeRemovedCS.getX();
			toBeRemovedCS.getY();
			
        	if(allCompoundShapesList.contains(toBeRemovedCS))
			{
				allCompoundShapesList.remove(toBeRemovedCS);
				System.out.println("Shape removed successfully!");
			}
        	else
        	{
        		System.out.println("Shape not found!");
        	}
        	
        }));
        
        currentItem = new Menu("Remove a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
		showShapeOptions.removeAll(showShapeOptions);
		
		//Modify a shape
		showShapeOptions.add(new MenuItem("Modify circle radius", 1, (parameters) -> {
			Circle toBeModified = new Circle();
			System.out.println("Enter the coordinates of the respective circle: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new radius: ");
				toBeModified.getRadius();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}
			
        }));
	   
		showShapeOptions.add(new MenuItem("Modify triangle sides", 2, (parameters) -> {
			  
			Triangle toBeModified = new Triangle();
			System.out.println("Enter the coordinates of the respective triangle: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new sides: ");
				toBeModified.getSides();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}	
				
	    }));
		
		showShapeOptions.add(new MenuItem("Modify equilateral sides", 3, (parameters) -> {
			  
			Equilateral toBeModified = new Equilateral();
			System.out.println("Enter the coordinates of the respective equilateral: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new sides: ");
				toBeModified.getLength();
				toBeModified.getWidth();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}
				
        }));
		
		showShapeOptions.add(new MenuItem("Modify square side", 4, (parameters) -> {
			  
			Square toBeModified = new Square();
			System.out.println("Enter the coordinates of the respective square: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new side: ");
				toBeModified.getSide();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}
        }));   
		
		showShapeOptions.add(new MenuItem("Modify house square side", 5, (parameters) -> {
			
			HouseShape toBeModified = new HouseShape();
			System.out.println("Enter the coordinates of the respective square: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allCompoundShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new side: ");
				toBeModified.getSide();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}
			
        }));
		
		showShapeOptions.add(new MenuItem("Modify house triangle side", 6, (parameters) -> {
			  
			HouseShape toBeModified = new HouseShape();
			System.out.println("Enter the coordinates of the respective triangle: ");
			toBeModified.getX();
			toBeModified.getY();	
			
			if(allCompoundShapesList.contains(toBeModified))
			{
				System.out.println("Enter the new sides: ");
				toBeModified.getSides();
				System.out.println("Shape modified!");				
			}
			else
			{
				System.out.println("Shape not found!");
			}
        }));
		
		        
        currentItem = new Menu("Modify a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
        showShapeOptions.removeAll(showShapeOptions);
        
        
        //Show all shapes
        currentItem = new MenuItem("Show all shapes", shortcut++, (parameters)->{
		   	
        	for(Shape currentShape: allShapesList)
    		{
    			currentShape.printShapes();
    		}
        	
        	for(CompoundShape currentShape: allCompoundShapesList)
    		{
    			currentShape.printShapes();
    		}
        	
        });      
        menuItems.add(currentItem);
        
        showShapeOptions.removeAll(showShapeOptions);           
	    
        mainMenu = new Menu("Main Menu", -1, menuItems);
	    
	}
	
	public void execute()
	{
	    mainMenu.execute();
	}

	
}