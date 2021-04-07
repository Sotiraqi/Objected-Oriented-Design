package reutilisablemenu.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import reutilisablemenu.abstractions.IMenuItem;
import reutilisablemenu.implementations.*;

public class ApplicationMenu extends Student{

	private Menu mainMenu = null;
	ArrayList<Student> studentsList = new ArrayList<Student>();
	Scanner input = new Scanner(System.in);
	String tab = "     ";
	
	private void uiAddStudent()
	{
		Student stud = readStudent(input);
		
		if(!studentsList.contains(stud))
		{
			studentsList.add(stud);
			System.out.println("Student added successfully!");
		}
		else
		{
			System.out.println("The student is already in the database!");
		}
		
		
	}
	
	private void uiDeleteStudent()
	{
		System.out.println("Please enter the surname of the student whom you like to delete!");
		String nameToDelete = input.next();
		Student currentStudent = new Student();
		currentStudent.setSurname(nameToDelete);
		
		if(!studentsList.contains(currentStudent))
		{
			studentsList.remove(currentStudent);
		}
		else
		{
			System.out.println("The student is not found in the database!");
		}
	}
	
	private void uiModifyStudent()
	{
		System.out.println("Please enter the surname of the student whom you like to modify!");
		String nameToModify = input.next();
		Student currentStudent = new Student();
		currentStudent.setSurname(nameToModify);
		
		if(!studentsList.contains(currentStudent))
		{
			studentsList.remove(currentStudent);
			currentStudent = readStudent(input);
			studentsList.add(currentStudent);
		}
		else
		{
			System.out.println("The student is not found in the database!");
		}
		
	}
	
	private void uiSortAscending()
	{
		System.out.println("Surname"+tab+"Name"+tab+"Year"+tab+"Average");
		Collections.sort(studentsList, Student.studCompareZA);
		
		for(Student stud: studentsList)
		{
			System.out.println(stud.getSurname()+tab+stud.getName()+tab+stud.getYear()+tab+stud.getAverage());
		}
		
	}
	
	private void uiSortDescending()
	{
		System.out.println("Surname"+tab+"Name"+tab+"Year"+tab+"Average");
		Collections.sort(studentsList, Student.studCompareAZ);
		
		for(Student stud: studentsList)
		{
			System.out.println(stud.getSurname()+tab+stud.getName()+tab+stud.getYear()+tab+stud.getAverage());
		}
	}
	
	
	public void load()
    {
        
		ArrayList<IMenuItem> menuItems = new ArrayList<IMenuItem>();
        ArrayList<IMenuItem> showStudentOptions = new ArrayList<IMenuItem>();
        
        int shortcut = 1;    
        
         
        IMenuItem currentItem = new MenuItem("Add a student", shortcut++, (parameters)->{
        	uiAddStudent();
        });       
        menuItems.add(currentItem);
       
        currentItem = new MenuItem("Delete a student", shortcut++, (parameters)->{
		   	uiDeleteStudent();
        });       
        menuItems.add(currentItem);      
	   
        currentItem = new MenuItem("Modify a student", shortcut++, (parameters)->{
        	uiModifyStudent();
        });
        menuItems.add(currentItem);
        
        currentItem = new Menu("Show all students", shortcut++, showStudentOptions);       
        menuItems.add(currentItem);
	   
        //Showing students sub menu
        showStudentOptions.add(new MenuItem("Sort from A to Z", 1, (parameters) -> {
		   
           	uiSortAscending();
        	System.out.println("Students sorted A to Z");   
        }));
	   
        showStudentOptions.add(new MenuItem("Sort from Z to A", 2, (parameters) -> {
        	
           	uiSortDescending();
	   	   	System.out.println("Students sorted Z to A");   
        }));
	   
	   
	    
        mainMenu = new Menu("Main Menu", -1, menuItems);
	    
	}
	
	public void execute()
	{
	    mainMenu.execute();
	}

	
}
