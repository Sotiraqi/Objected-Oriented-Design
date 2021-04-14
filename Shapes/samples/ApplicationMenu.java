package shapes.samples;

import java.util.ArrayList;
import java.util.Scanner;

import shapes.abstractions.IMenuItem;
import shapes.implementations.*;

public class ApplicationMenu
{

	private Menu mainMenu = null;
	Scanner input = new Scanner(System.in);
	
	public void load()
    {
        //Menu Lists
		ArrayList<IMenuItem> menuItems = new ArrayList<IMenuItem>();
		ArrayList<IMenuItem> showShapeOptions = new ArrayList<IMenuItem>();
		
		//Reference objects
		Circle circ = new Circle();
		Triangle trng = new Triangle();
		Equilateral eqt = new Equilateral();
		Square sqr = new Square();
		
		
		//Adding a shape
		showShapeOptions.add(new MenuItem("Circle", 1, (parameters) -> {
			
			circ.createShape();			
        }));
	   
		showShapeOptions.add(new MenuItem("Triangle", 2, (parameters) -> {
			  
			trng.createShape();	
				
	    }));
		
		showShapeOptions.add(new MenuItem("Equilateral", 3, (parameters) -> {
			  
	        eqt.createShape();
				
        }));
		
		showShapeOptions.add(new MenuItem("Square", 4, (parameters) -> {
			  
	       	sqr.createShape();			
        }));
		
		Menu currentItem;
		int shortcut = 1;
	   
        currentItem = new Menu("Insert a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
        showShapeOptions.removeAll(showShapeOptions);
        
        
        //Removing a shape menu
        showShapeOptions.add(new MenuItem("Circle", 1, (parameters) -> {
			
			circ.deleteShape();			
        }));
	   
		showShapeOptions.add(new MenuItem("Triangle", 2, (parameters) -> {
			  
			trng.deleteShape();	
				
	    }));
		
		showShapeOptions.add(new MenuItem("Equilateral", 3, (parameters) -> {
			  
	        eqt.deleteShape();
				
        }));
		
		showShapeOptions.add(new MenuItem("Square", 4, (parameters) -> {
			  
	       	sqr.deleteShape();			
        }));       
		
		currentItem = new Menu("Remove a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
		showShapeOptions.removeAll(showShapeOptions);
		
		//Modify a shape
		showShapeOptions.add(new MenuItem("Circle", 1, (parameters) -> {
			
			circ.modifyShape();			
        }));
	   
		showShapeOptions.add(new MenuItem("Triangle", 2, (parameters) -> {
			  
			trng.modifyShape();	
				
	    }));
		
		showShapeOptions.add(new MenuItem("Equilateral", 3, (parameters) -> {
			  
	        eqt.modifyShape();
				
        }));
		
		showShapeOptions.add(new MenuItem("Square", 4, (parameters) -> {
			  
	       	sqr.modifyShape();			
        }));       
		
		        
        currentItem = new Menu("Modify a shape", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
        
        showShapeOptions.removeAll(showShapeOptions);
        
        //Show all shapes
        currentItem = new Menu("Show all current shapes", shortcut++, showShapeOptions);       
        menuItems.add(currentItem);
		
			           
	    
        mainMenu = new Menu("Main Menu", -1, menuItems);
	    
	}
	
	public void execute()
	{
	    mainMenu.execute();
	}

	
}