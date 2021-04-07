package reutilisablemenu.implementations;

import reutilisablemenu.abstractions.IMenuItem;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu implements IMenuItem {
	
	private ArrayList<IMenuItem> menuItems = new ArrayList<IMenuItem>();
	private boolean continueMenuLoop;
	private String text;
	private int shortcut;
	Scanner input = new Scanner(System.in);
	
	
	public Menu(String text, int shortcut, ArrayList<IMenuItem> menuItems)
	{
		this.text = text;
        this.shortcut = shortcut;
        
        this.menuItems.add(new MenuItem("Exit", 0, (parameters) -> {
            continueMenuLoop = false;
        }));
        this.menuItems.addAll(menuItems);
	}
	
	private void renderItems()
    {
        menuItems.forEach((item) -> {
            item.render();
        });
        
        System.out.println("Please enter your option: ");
    }
    
    public void execute()
    {
        continueMenuLoop = true;
        do
        {
           renderItems();
           int option = readUserOption(input);
           IMenuItem selectedItem = selectMenuItem(option);
           if (selectedItem != null)
           {
               selectedItem.execute();
           }            
            
        }while(continueMenuLoop);
    }

    private int readUserOption(Scanner input) 
    {        
    	int option = input.nextInt();
         
        return option;        
    }

    private IMenuItem selectMenuItem(int option) 
    {
        
        for(int i = 0; i < menuItems.size(); i++)
        {
            if (menuItems.get(i).getShortcut() == option)
            {
                return menuItems.get(i);
            }
        }
        
        return null;
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public int getShortcut() {
		// TODO Auto-generated method stub
		return shortcut;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(shortcut+". "+text);

	}

}
