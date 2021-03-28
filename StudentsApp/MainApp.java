package studentapp;

import java.util.InputMismatchException;

public class MainApp {

	public static void main(String[] args) {
		Menu app = new Menu();
		
		try
		{
				app.run_menu();
		}
		catch(InputMismatchException e)
		{
			System.out.println("You cant input "+e.getMessage()+". Closing program!");
		}

	}

}
