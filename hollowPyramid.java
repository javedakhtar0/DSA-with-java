
//print the hollow rectangle using for loop.
import java.util.*;

public class hollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length: ");
        int len = sc.nextInt();
        System.out.print("Enter the width: ");
        int wid = sc.nextInt();
        sc.close();


        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= wid; j++) {
                if (i == 1 || i == len || j == 1 || j == wid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
