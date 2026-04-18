public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate average marks using a loop
    public double calculateAverage() {
        if (marks == null || marks.length == 0) return 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark; // Loop to calculate total marks
        }
        return (double) sum / marks.length;
    }

    // Method to calculate GPA based on average (4.0 scale)
    public double calculateGPA() {
        double average = calculateAverage();
        if (average >= 90) return 4.0;
        if (average >= 80) return 3.0;
        if (average >= 70) return 2.0;
        if (average >= 60) return 1.0;
        return 0.0;
    }

    // Method to determine grade based on average
    public char getGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    // Method to display student report card
    public void displayInfo() {
        System.out.println("\n=====================================");
        System.out.println("        STUDENT REPORT CARD          ");
        System.out.println("=====================================");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.print("Marks       : [");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + (i == marks.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("-------------------------------------");
        System.out.printf("Average     : %.2f%%\n", calculateAverage());
        System.out.printf("GPA         : %.1f\n", calculateGPA());
        System.out.println("Grade       : " + getGrade());
        System.out.println("=====================================\n");
    }
}
