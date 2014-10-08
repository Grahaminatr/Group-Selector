import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class gradebook
	{

	public static void main(String[] args)
		{
		ArrayList<Student> gradebook = new ArrayList <Student> ();
		
		Scanner file = new Scanner(new File("classroster.txt"));
		int numberOfStudents = file.nextInt();
		
		for (int i=0; i < numberOfStudents; i++)
			{
			String firstName = file.next();
			String lastName = file.next();
			Double score = file.nextDouble();
			
			gradebook.add(new Student(firstName,lastName,score,0));
			Collections.sort(gradebook,new ScoreSorter());
			
			}
		System.out.println("How many groups are needed");
		
		Scanner userInput = new Scanner(System.in);
		int numberOfGroups = userInput.nextInt();
		
			int groupNumber = 1;
			for(int x = 0; x < gradebook.size(); x++)
				{
				gradebook.get(x).setGroup(groupNumber);
				if(groupNumber < numberOfGroups)
					groupNumber=groupNumber +1;
				else
					groupNumber=groupNumber - 1;
				
				}
			Collections.sort(gradebook,new ScoreSorter());
			Collections.sort(gradebook,new NameSorter());
			for(int x<0; x<gradebook.size(); x++)
				{
			for(int i= 1)
				}

		}

	}
