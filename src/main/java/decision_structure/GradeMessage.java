package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent Job!";
            case "B" -> "Great Job!";
            case "C" -> "Good Job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error! Invalid grade";
        };

        System.out.println(message);
    }
}
