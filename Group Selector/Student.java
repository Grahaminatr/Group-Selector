
public class Student
	{
		String firstName;
		String lastName;
		Double score;
		
		public Student (String fn, String ln, Double s)
			{
				firstName=fn;
				lastName=ln;
				score=s;
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
		public String toString()
			{
			return "Student [firstName=" + firstName + ", lastName=" + lastName
					+ ", score=" + score + ", getFirstName()=" + getFirstName()
					+ ", getLastName()=" + getLastName() + ", getScore()="
					+ getScore() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
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
