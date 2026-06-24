import java.util.Scanner;

public class s_17316_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        
        String[] names = new String[n];
        int[] marks = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter marks (0-100): ");
            marks[i] = sc.nextInt();
        }

        
        double average = calculateaverage(marks);
        int highest = findhighestMark(marks);

        
        int distinctioncount = 0;
        int passcount = 0;
        int failcount = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] >= 75) {
                distinctioncount++;
            } else if (marks[i] >= 50) {
                passcount++;
            } else {
                failcount++;
            }
        }

       
        System.out.println("\n--- Class Report ---");
        System.out.println("Average Marks: " + String.format("%.2f", average));
        System.out.println("Highest Marks: " + highest);
        System.out.println("Distinction Students: " + distinctioncount);
        System.out.println("Pass Students: " + passcount);
        System.out.println("Fail Students: " + failcount);

        sc.close();
    }

    
    public static double calculateaverage(int[] marks) {
        int sum = 0;
        
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length; 
    }

    
    public static int findhighestMark(int[] marks) {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }
}