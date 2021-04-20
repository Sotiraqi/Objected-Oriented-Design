package standardfileioplugin;

import fileiowithplugins.abstractions.IOutputDevice;

import java.io.*;


public class FileOutputDevice implements IOutputDevice {

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
