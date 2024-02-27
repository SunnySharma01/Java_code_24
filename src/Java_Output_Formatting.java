import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Print the header
        System.out.println("================================");

        // Process each line
        for (int i = 0; i < n; i++) {
            // Read the String and the integer
            String str = scanner.next();
            int num = scanner.nextInt();

            // Format and print the output
            System.out.printf("%-15s%03d%n", str, num);
        }

        // Print the footer
        System.out.println("================================");

        scanner.close();
    }
}

