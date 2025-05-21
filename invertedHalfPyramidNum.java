// half pyramid with numbers

import java.util.*;

public class invertedHalfPyramidNum {
    public static void main(String args[]) {
        System.out.print("Enter the length of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        for (int i = len; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
