
public class Student
	{
		String firstName;
		String lastName;
		Double score;
		int group;
		
		public Student (String fn, String ln, Double s,int g)
			{
				firstName=fn;
				lastName=ln;
				score=s;
				group=g;
			}
		public String getFirstName()
			{
			return firstName;
			}

		public String getLastName()
			{
			return lastName;
			}

		public Double getScore()
			{
			return score;
			}
		
		public int getGroup()
			{
			return group;
			}

		public void setFirstName(String firstName)
			{
			this.firstName = firstName;
			}

		public void setLastName(String lastName)
			{
			this.lastName = lastName;
			}

		public void setScore(Double score)
			{
			this.score = score;
			}
		
		public void setGroup(int group)
			{
			this.group = group;
			}

//	create a Student Constructor
//	firstName;
//	lastName;
//	score;
//	getters, setters, and toString
//	
//Instantiate ArrayList;
//Scanner for text file
//file.nextInt() = numberOfStudents
//
//for loop
//	(0-numberOfStudents)
//	file.next() =firstName;
//	file.next() =lastName;
//	file.nextDouble() = score;
//	
//add students to ArrayList;
//
//sort students by score and put in order;
//Collections.sort(grade book,new ScoreSorter());???
//
//ask for number of groups?
//	if group number is higher than the student number show error?
//	Scanner for input
//	
//for loop to create number of groups (0-how many user says)
//
//	for loop to assign ArrayList students to each of the groups
//		(0-ArrayList length)
//			getFirstName()
//			getLastName()
//			getScore()


	}
