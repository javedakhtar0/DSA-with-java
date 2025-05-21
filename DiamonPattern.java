// take inpt from the user and print the diamond pattern.

import java.util.*;

public class DiamonPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int row = sc.nextInt();
        sc.close();


        for (int i = 1; i <= row; i++) {

            // for space
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            // for star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= row - 1; i++) {

            // for lower space
            for (int l = 1; l <= i; l++) {
                System.out.print(" ");
            }

            // for lower star
            for (int m = i; m >= 0; m++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
