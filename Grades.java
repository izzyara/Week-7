import java.util.*;
public class Grades

{
    public static void main (String[] args)
    {
    int grade;
    String letterGrade;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your numeric grade: ");
    grade = input.nextInt();
    input.close();

    if (grade >= 90){
        letterGrade = "A";
    
    }else if (grade >= 80 && grade < 90){
        letterGrade = "B";
    
    }else if (grade >= 70 && grade < 80){
    letterGrade = "C";
    
    }else if (grade >= 60 && grade < 70){
    letterGrade = "D";
    }else{
    letterGrade = "F";
    }

    input.close();
    System.out.println("Your letter grade is " + letterGrade);
    }
}