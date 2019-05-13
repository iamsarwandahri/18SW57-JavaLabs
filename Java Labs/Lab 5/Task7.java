
import java.util.*;
class Student{
	public String name;
	public String age;
	public String program;
}
class Task7
{
	public static void main(String[] args)
	{
		String s="Ali,18,BE_Software; Aisha,19,BE_Software;";
		String delimiters = ",;";
		String[] array = s.split(delimiters);
		Student student1 = new Student();
		student1.name=array[0];
		System.out.println(student1.name);
		student1.age=array[1];
		System.out.println(student1.age);
		student1.program=array[2];
		System.out.println(student1.program);
	}
}