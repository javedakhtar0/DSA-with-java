// print solid rhombus

import java.util.*;

public class SolidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = sc.nextInt();

        // outer loop for length
        for (int i = 1; i <= len; i++) {

            // for space
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j <= len; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }

}
