import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][4];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter scores for Student " + (i + 1) + " (Math, Science, English, History):");
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }
        double[] studentAverages = calculateStudentAverages(scores);
        System.out.println("Average scores for each student:");
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAverages[i]);
        }
        double[] subjectAverages = calculateSubjectAverages(scores);
        System.out.println("Average scores for each subject:");
        String[] subjects = {"Math", "Science", "English", "History"};
        for (int i = 0; i < subjectAverages.length; i++) {
            System.out.println(subjects[i] + ": " + subjectAverages[i]);
        }

        scanner.close();
    }
    public static double[] calculateStudentAverages(int[][] scores) {
        double[] averages = new double[scores.length];
        
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            averages[i] = (double) sum / scores[i].length;
        }
        
        return averages;
    }
    public static double[] calculateSubjectAverages(int[][] scores) {
        double[] averages = new double[scores[0].length];
        
        for (int j = 0; j < scores[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            averages[j] = (double) sum / scores.length;
        }
        
        return averages;
    }
}