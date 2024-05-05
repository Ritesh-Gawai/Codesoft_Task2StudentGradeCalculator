import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]){
        System.out.println("Student Grade Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Subject");

        int subject=sc.nextInt();
        int totolMarks=1;

        for(int i=1;i<=subject;i++){
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks=sc.nextInt();
            totolMarks+=marks;
        }
        float averagePercentage = (float) totolMarks / subject;

        System.out.println("Total Marks: " + totolMarks);
        System.out.println("Average Percentage: " + averagePercentage);

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
    private static String calculateGrade(float averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else if (averagePercentage >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}
