public class StudentDetails
{
public static void main(String args[])
{
	System.out.println("invoked main method by JVM");
	arrayOfPercentage();
}

public static void arrayOfPercentage()
{
	System.out.println("invoke student percentage");
	float percentageOfAnita=86.9f;
	float percentageOfGeeta=78.33f;
	float percentageOfManu=57.9f;
	float percentageOfShree=97.2f;
	float percentageOfRita=67.0f;
	
	float[] percentage={percentageOfAnita,percentageOfGeeta,percentageOfManu,percentageOfShree,percentageOfRita};
	int sizeOfArray=percentage.length;
	System.out.println("Size of Array is "+sizeOfArray);
	
	float elementAtIndex1=percentage[1];
	System.out.println("percentage of Students :"+elementAtIndex1);
	
	float elementAtIndex4=percentage[4];
	System.out.println("percentage of Students :"+elementAtIndex4);
}
}