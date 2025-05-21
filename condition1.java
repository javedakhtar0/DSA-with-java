// get input age from the user and show adult or not 

import java.util.*;

public class condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.err.println("You are an adult!");
        } else {
            System.err.println("You are not adult!");
        }

    }

}
