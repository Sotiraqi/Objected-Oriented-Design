package studentapp;

import java.util.Comparator;

public class Student 
{
	private String name;
	private String surname;
	private int year;
	private double average;
	
	public String get_name()
	{
		return name;
	}
	
	public void set_name(String name)
	{
		this.name = name;
	}
	
	public String get_surname()
	{
		return surname;
	}
	
	public void set_surname(String surname)
	{
		this.surname = surname;
	}
	
	public int get_year()
	{
		return year;
	}
	
	public void set_year(int year)
	{
		this.year = year;
	}
	
	public double get_average()
	{
		return average;
	}
	
	public void set_average(double average)
	{
		this.average = average;
	}
	
	public static Comparator<Student> stud_compare = new Comparator<Student>()
	{
				public int compare(Student s1, Student s2)
				{
					String stud1_name = s1.get_surname().toUpperCase();
					String stud2_name = s2.get_surname().toUpperCase();
					
					return stud1_name.compareTo(stud2_name);
				}
	};

}
