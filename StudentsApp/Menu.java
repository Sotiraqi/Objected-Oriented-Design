package studentapp;

import java.util.*;
import java.io.IOException;

public class Menu 
{
	private Scanner input = new Scanner(System.in);
	private ArrayList<Student>  students_list = new ArrayList<Student>();
	
	protected void display_menu()
	{
		try
		{
			new ProcessBuilder("cmd.exe", "/c", "cls").inheritIO().start().waitFor();
			//Runtime.getRuntime().exec("cmd.exe /C start");
		}
		catch(InterruptedException | IOException e)
		{
			System.out.println("The console cannot be cleaned!"+e.getMessage());
		}
		
		
		
		System.out.println("/*********** WELCOME TEACHER ************/");
		System.out.println("1. Add a student");
		System.out.println("2. Modify data");
		System.out.println("3. Remove a student ");
		System.out.println("4. Show all students");
		System.out.println("0. Exit");
	}
	
	public void run_menu()
	{
		int option;
		do
		{		
			
			display_menu();
			option = input.nextInt();
			
			switch( option )
			{
			case 1:
				ui_add_student();
				break;
			case 2:
				ui_modify_student();
				break;
			case 3: 
				ui_delete_student();
				break;
			case 4:
				ui_show_students();
				break;
			default:
				System.out.println("Please insert a valid option: ");		
			}
		
		} while(option != 0);
			
			System.out.println("Closing application...");			
}
			
		
	
	
	private Student read_student()
	{
		Student stud = new Student();
		input.nextLine();
		System.out.print("Introduce name: ");
		stud.set_name(input.nextLine());
		System.out.print(("Introduce surname: "));
		stud.set_surname(input.nextLine());
		System.out.print(("Introduce academic year: "));
		stud.set_year(input.nextInt());
		System.out.print("Introduce student's average: ");
		stud.set_average(input.nextDouble());
		
		return stud;		
	}
	
	private void print_student_list(Student stud)
	{
		System.out.println(stud.get_surname()+"\t"+stud.get_name()+"\t"+stud.get_year()+"\t"+stud.get_average());
	}
	
	private void ui_add_student()
	{
		System.out.println("Add a student:");
		Student stud = read_student();
		
		if(!students_list.contains(stud))
		{
			students_list.add(stud);
			System.out.println("Student added successfully!");
			return;
		}
		
		System.out.println("The student is already in the database!");
	}
	
	private void ui_delete_student()
	{
		System.out.println("Please enter the surname of the student whom you like to delete!");
		String name_to_delete = input.nextLine();
		int index_count = 0;
		
		for(Student current_student: students_list)
		{
			if(name_to_delete.equals(current_student.get_name()))
			{
				students_list.remove(current_student);
				System.out.println("Student removed successfully from database!");
				break;
			}
			else
			{
				index_count++;
			}
			
			if(index_count == students_list.size())
			{
				System.out.println("Student not found on database!");
			}
								
		}
	}
	
	private void ui_modify_student()
	{
		System.out.println("Enter the surname of the student whom you like to modify: ");
		String name_to_find = input.nextLine();
		int index_count = 0;
		
		for(Student current_student: students_list)
		{
			if(name_to_find.equals(current_student.get_surname()))
			{
				System.out.println("New credentials:");
				current_student = read_student();
				System.out.println("Credentials updated successfully!");
				break;
			}
			else
			{
				index_count++;				
			}
			
			if(index_count == students_list.size())
			{
				System.out.println("Student not found on database!");
			}	
		}
	}
	
	
	
	private void ui_show_students()
	{
		System.out.println("Surname \tName \tYear \tAverage");
		//Collections.sort(students_list, Student.stud_compare);
		
		for(Student current_student: students_list)
		{
			print_student_list(current_student);
		}
		
		
	}
}
