package standardioplugin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import iowithplugins.abstractions.IOutputDevice;

public class StdOutputDevice implements IOutputDevice {

	@Override
    public void WriteString(String s) {
       FileOutputStream outputStream = null;

        try
        {
            outputStream = new FileOutputStream("output.txt");
            PrintWriter fileWriter = new PrintWriter(outputStream);
            
            fileWriter.print(s);
            fileWriter.close();

            
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening file!" + e.getMessage());
        }
                
        if(outputStream != null) {
            try
            {
                outputStream.close();
            }
            catch(IOException e)
            {
                System.out.println("The file is not opened!" + e.getMessage());
            }
        }
    }

}
