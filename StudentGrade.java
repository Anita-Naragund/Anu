public class StudentGrade
{
public static void main(String[] args)
{
	System.out.println("invoked method by JVM");
	gradeOfStudents();
}
public static void gradeOfStudents()
{
	System.out.println("Student Grades");
	char gradeOfAnu='S';
	char gradeOfBavya='B';
	char gradeOfGeeta='A';
	char gradeOfRita='C';
	char gradeOfMeera='S';
	char gradeOfKavya='A';
	char gradeOfShree='D';
	char gradeOfPrii='E';
	char gradeOfSiri='S';
	char gradeOfRadha='A';
	
	char[] grades={gradeOfAnu,gradeOfBavya,gradeOfGeeta,gradeOfRita,gradeOfMeera,gradeOfKavya,gradeOfShree,gradeOfPrii,gradeOfSiri,gradeOfRadha};
	int sizeOfArray=grades.length;
	System.out.println("Size of array "+sizeOfArray);
	
	char elementAtIndex2=grades[2];
	System.out.println("Grades of student :"+elementAtIndex2);
	
	char elementAtIndex5=grades[5];
	System.out.println("Grades of student :"+elementAtIndex5);
	
	char elementAtIndex8=grades[8];
	System.out.println("Grades of student :"+elementAtIndex8);
	
	char elementAtIndex0=grades[0];
	System.out.println("Grades of student :"+elementAtIndex0);
	
	
}
}