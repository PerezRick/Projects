import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        String[] studentNames = {"Culaba", "Masamayor", "Cuñado", "Bandigan", "Ilisan",};
        int[] studentScores = {89, 90, 95, 91, 93};
        
        displayStudents(studentNames, studentScores);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student to update the score: ");
        String studentUpdate = sc.nextLine();

        int index = -1;
        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equalsIgnoreCase(studentUpdate)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Enter the updated score for " + studentUpdate + ": ");
            int newScore = sc.nextInt();
            studentScores[index] = newScore;

            displayStudents(studentNames, studentScores);
        } else {
            System.out.println("Student is not found in the list.");
        }
    }

    public static void displayStudents(String[] names, int[] scores) {
        System.out.println("Updated Student List and Scores:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }
    }
}