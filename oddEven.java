// get input as number from the user and check the given number is even or odd

import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
