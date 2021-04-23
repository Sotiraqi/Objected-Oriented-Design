package standardioplugin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import iowithplugins.abstractions.IInputDevice;

public class StdInputDevice implements IInputDevice {

	@Override
    public String ReadString() {
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
