package reutilisablemenu.implementations;

import java.util.Comparator;
import java.util.Scanner;

public class Student 
{
	private String name;
	private String surname;
	private int year;
	private double average;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public void setAverage(double average)
	{
		this.average = average;
	}
	
	
	public Student readStudent(Scanner input)
	{
		Student stud = new Student();
		input.nextLine();
		System.out.print("Introduce name: ");
		stud.setName(input.nextLine());
		System.out.print(("Introduce surname: "));
		stud.setSurname(input.nextLine());
		System.out.print(("Introduce academic year: "));
		stud.setYear(input.nextInt());
		System.out.print("Introduce student's average: ");
		stud.setAverage(input.nextDouble());
		
		return stud;
	}
	
	@Override	
	public boolean equals(Object o)
	{
		if(o instanceof Student)
		{
			Student toCompare = (Student)o;
			
			if(toCompare.getSurname().equals(this.getSurname()))
			{
				return true;
			}
				
		}
		return false;		
	}
	
	public static Comparator<Student> studCompareAZ = new Comparator<Student>()
	{
				public int compare(Student s1, Student s2)
				{
					String stud1Name = s1.getSurname().toUpperCase();
					String stud2Name = s2.getSurname().toUpperCase();
					
					return stud1Name.compareTo(stud2Name);
				}			
				
	};
	
	public static Comparator<Student> studCompareZA = new Comparator<Student>()
	{
				public int compare(Student s1, Student s2)
				{
					String stud1Name = s1.getSurname().toUpperCase();
					String stud2Name = s2.getSurname().toUpperCase();
					
					return stud2Name.compareTo(stud1Name);
				}			
				
	};
	
	

}
