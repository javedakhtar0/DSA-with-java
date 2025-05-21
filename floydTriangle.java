// half pyramid with numbers

import java.util.*;

public class floydTriangle {
    public static void main(String args[]) {
        System.out.print("Enter the length of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();
        int n = 1;

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
