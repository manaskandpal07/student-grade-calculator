import java.util.Scanner;

public class studentcalculater {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // enter marks for each subject
        System.out.println("Enter marks out of 100 for each subject:");
        System.out.print("Subject 1: ");
        int subject1Marks = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2Marks = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3Marks = scanner.nextInt();


        scanner.close();

        //  total sum
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        //  average percentage
        double averagePercentage = totalMarks / 3.0;

        // average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // result
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
