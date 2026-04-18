import java.util.Scanner;

public class StudyPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter hours available: ");
        int hours = sc.nextInt();

        System.out.println("Recommended study plan:");
        System.out.println("Focus more on " + subject + " for " + hours + " hours.");

        sc.close();
    }
}
