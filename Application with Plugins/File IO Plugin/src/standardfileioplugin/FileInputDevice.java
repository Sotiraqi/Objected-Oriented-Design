package standardfileioplugin;

import fileiowithplugins.abstractions.IInputDevice;

import java.io.*;
import java.util.Scanner;

public class FileInputDevice implements IInputDevice {

	 @Override
	    public String readString() {
	        FileInputStream inputStream = null;
	        String string = " ";
	        try
	        {
	            inputStream = new FileInputStream("file.txt");
	            Scanner input = new Scanner(inputStream);
	            string = input.nextLine();         
	            input.close();
	        }
	        catch (FileNotFoundException e)
	        {
	            System.out.println("Error opening file!" + e.getMessage());
	        }
	        	        
	        if(inputStream != null) {
	            try
	            {
	                inputStream.close();
	            }
	            catch(IOException e)
	            {
	                System.out.println("The file is not opened!" + e.getMessage());
	            }
	        }
	        
	        return string;
	    }

}
