import java.util.Scanner;

public class MarksCalculator {
public static void ComputeAvg(){

//initializing the variables to store the marks
    double javaMarks, networkingMarks, mathMarks, avg;

//creating scanner object
Scanner input = new Scanner(System.in);

//asking the lecturer to enter marks for the three units
System.out.println("Enter marks for Java Programming: ");
  javaMarks = input.nextDouble();

System.out.println("Enter marks for Networking: ");
  networkingMarks = input.nextDouble();

System.out.println("Enter marks for Math: ");
  mathMarks = input.nextDouble();

//computing the average marks
  avg = (javaMarks + networkingMarks + mathMarks) / 3;

//displaying the results
System.out.println("Marks for Java Programming: " + javaMarks);
System.out.println("Marks for Networking is " + networkingMarks);
System.out.println("Marks for Math is " + mathMarks);
System.out.println("The average is: " + avg); 

}

public static void main(String [] args){
//calling the method
ComputeAvg();

}
}