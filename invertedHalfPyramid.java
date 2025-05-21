// inverted half pyramid

import java.util.*;

public class invertedHalfPyramid {

    public static void main(String args[]) {
        System.out.print("Enter the length of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}