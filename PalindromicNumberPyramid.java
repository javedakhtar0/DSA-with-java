import java.util.*;

public class PalindromicNumberPyramid {
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
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print numbers
            for (int k = 1; k < i; k++) {
                System.out.print(k + 1);
            }

            // Print spaces
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
