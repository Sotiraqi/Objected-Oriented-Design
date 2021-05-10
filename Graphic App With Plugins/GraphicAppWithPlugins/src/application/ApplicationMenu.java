package application;

import graphicappwithplugins.abstractions.*;
import java.util.*;

public class ApplicationMenu {
	private int chooseShape(List<IShapePlugin> pluginsList)
	{
		int option = 0;
		
		System.out.println("Please select a shape from avaliable shapes: ");
		for(IShapePlugin plugin: pluginsList)
		{
			int menuOption = 0;
			System.out.println(menuOption+". "+plugin.getPluginName());
			menuOption++;
		}
		
		Scanner input  = new Scanner(System.in);
		option = input.nextInt();
		input.close();
		return option;
	}
	
	public void run()
	{
		PluginsManager pluginsManager = new PluginsManager();
		pluginsManager.loadPlugins("/plugins");
        List<IShapePlugin> pluginsList = pluginsManager.getPluginsList();
        ArrayList<IShape> workPlan = new ArrayList<IShape>();
        
        while (true) 
        {
            int option = chooseShape(pluginsList);	
            System.out.println("0. Print all shapes");
            if(option>=1 && option <= pluginsList.size())
            {
               IShapePlugin selectedPlugin = pluginsList.get(option - 1);
               IShape selectedShape = selectedPlugin.getShape();
               if (selectedShape != null)
               {
                   selectedShape.getAllDetails();
                   workPlan.add(selectedShape);
               }
            }
            else if(option == 0)
            {
            	for(IShape shape: workPlan)
            	{
            		shape.printShape();
            	}
            }
            else
            {
                System.out.println("Invalid selection");
                break;
            }
            
          }
  
	}
}
