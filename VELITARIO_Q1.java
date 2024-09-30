import java.util.Scanner;

public class StudentEnrollment {
    public static void main(String[] args) {
        // Constants
        final int MAX_SUBJECTS = 10; // Maximum allowed number of subjects (units)
        final int FEE_PER_UNIT = 1000; // Fee for each unit

        // Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine(); // Get the student's name

        System.out.print("Enter Course: ");
        String course = scanner.nextLine(); // Get the course name

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine(); // Get the course code

        System.out.print("Enter Number of Units (max 10): ");
        int numberOfUnits = scanner.nextInt(); // Get the number of units the student is enrolling in

        // Validate number of units
        if (numberOfUnits > MAX_SUBJECTS || numberOfUnits <= 0) {
            System.out.println("Invalid number of units. Maximum is " + MAX_SUBJECTS + ".");
            return; // Exit the program if the number of units is not valid
        }

        // Calculate total enrollment fee based on the number of units
        int totalFee = numberOfUnits * FEE_PER_UNIT;

        // Output student details and total fee
        System.out.println("\nStudent Name: " + studentName); // Display the student's name
        System.out.println("Course: " + course + " (" + courseCode + ")"); // Display the course and its code
        System.out.println("Total Enrollment Fee: PHP " + totalFee); // Display the total fee for the units

        // Payment process
        System.out.print("Enter Payment Amount: ");
        int payment = scanner.nextInt(); // Get the payment amount from the student

        // Check the payment status
        if (payment == totalFee) {
            // If the payment matches the total fee, the student is fully paid
            System.out.println("\nFully Paid");
        } else if (payment < totalFee) {
            // If the payment is less than the total fee, it's a partial payment
            System.out.println("\nPartial Payment Amount");
            System.out.println("Amount Paid: PHP " + payment);
            System.out.println("Remaining Balance: PHP " + (totalFee - payment)); // Display the remaining balance
        } else {
            // If the payment exceeds the total fee, it's an overpayment
            System.out.println("\nOverpayment");
            System.out.println("Change: PHP " + (payment - totalFee)); // Calculate and show the change
            System.out.println("Fully Paid");
        }

        scanner.close();
    }
}