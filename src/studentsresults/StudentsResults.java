package studentsresults;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        
        //=== STUDENT END OF SEMESTER RESULTS CALCULATOR ===
        //1. Get sudent information
        try (Scanner input = new Scanner(System.in)) {
            //=== STUDENT END OF SEMESTER RESULTS CALCULATOR ===
            
            //1. Get sudent information
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            
            System.out.print("How many modules did the student take? ");
            int numModules = input.nextInt();
            
            //2. Input score for each course
            double total = 0;
            ArrayList<Double> modules = new ArrayList<>();
            
            for (int i = 1; i <= numModules; i++){
                System.out.print("Enter score for module " + i + " (0-100): ");
                double score = input.nextDouble();
                
                modules.add(score);
                total += score;
            }
            
            //3. Calculate average
            double average = total / numModules;
            
            //4. Determine grade
            String grade;
            
            if(average >= 80){
                grade = "A";
            } else if(average >= 70){
                grade = "B";
            } else if(average >= 60){
                grade = "C";
            } else if(average >= 50){
                grade = "D";
            } else {
                grade = "F";
            }
            
            //5. Determine remarks
            String remarks;
            
            remarks = switch (grade) {
                case "A", "B" -> "Distiction! Keep it up.";
                case "C" -> "Merit! but you can do better.";
                case "D" -> "Pass! You need to improve your work.";
                default -> "Fail! You need to work harder.";
            };
            
            //6. Display results
            System.out.println("\n==== END OF SEMESTER RESULTS ====");
            System.out.println("Student Name: " + name);
            System.out.println("Total Courses: " + numModules);
            System.out.println("Score: " + modules);
            System.out.println("Total Score: " + total);
            System.out.printf("Average Score: %.2f%%\n" ,average);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
            System.out.println("=================================");
        }
    }
}
