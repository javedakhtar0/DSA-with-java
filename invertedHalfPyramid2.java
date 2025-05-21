// inverted half pyramid rotated at 180 deg

import java.util.*;

public class invertedHalfPyramid2 {
    public static void main(String args[]) {
        System.out.print("Enter the length of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        for (int i = 1; i <= len; i++) {
            // for space
            for (int j = 0; j < len - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}