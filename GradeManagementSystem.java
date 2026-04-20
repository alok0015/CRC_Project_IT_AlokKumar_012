import java.util.Scanner;
public class GradeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*      STUDENT GRADE MANAGEMENT SYSTEM          *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");

        try {
            System.out.print("\n[STEP 1] Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("[STEP 2] Enter Roll Number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("[STEP 3] Enter Number of Subjects: ");
            int numSubjects = Integer.parseInt(scanner.nextLine());
            int[] marks = new int[numSubjects];
            System.out.println("\n[STEP 4] Enter marks for each subject (out of 100):");
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("   -> Subject " + (i + 1) + ": ");
                marks[i] = Integer.parseInt(scanner.nextLine());
                
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("      Error: Marks should be between 0 and 100. Resetting to 0.");
                    marks[i] = 0;
                }
            }

            Student student = new Student(name, rollNumber, marks);

            System.out.println("\nCalculations complete! Generating report...");
            Thread.sleep(1000); // Small pause for effect 
            student.displayInfo();
        } catch (NumberFormatException e) {
            System.out.println("\n[ERROR] Invalid input! Please enter numeric values for roll number, subjects, and marks.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            scanner.close();
            System.out.println("Exiting System. Have a great day!");
        }
    }
}
