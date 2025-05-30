import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = sc.nextInt();

        for (int i = 1; i <= len; i++) {
            // Print spaces
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
