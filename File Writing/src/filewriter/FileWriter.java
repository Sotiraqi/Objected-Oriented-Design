package filewriter;

import java.util.Scanner;
import java.io.*;

public class FileWriter {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BufferedWriter bwriter = null;
		try 
		{
			bwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\IA\\File Writing\\file_out.txt")));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist!");
			e.printStackTrace();
		}
		
		System.out.println("Please input words: ");
		String word = input.nextLine();
		
		while(!word.equals("end"))
		{
			try 
			{
				bwriter.write(word);
			} 
			catch (IOException e) 
			{
				System.out.println("Word can't be writed");
				e.printStackTrace();
			}
			
			word = input.nextLine();
		}
		
		try 
		{
			bwriter.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Cannot close file!");
			e.printStackTrace();
		}
		input.close();

	}

}
