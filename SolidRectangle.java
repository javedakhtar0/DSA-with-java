// take length and width as an input from the user to print the Solid rectangle using netsted loops.

import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // use Scanner class to get inputs
        System.out.print("Enter the length of the Rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the width of the Rectangle: ");
        int wid = sc.nextInt();
        sc.close();


        for (int i = 0; i < len; i++) {     //outer loop for row
            for (int j = 0; j < wid; j++) {     //inner loop for column
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

}
