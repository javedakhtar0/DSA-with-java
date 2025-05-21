
//get a choice as character from the user and print the greeting according to the choice 
//like a:Good Morning, b:Good Evening, c:Good Afaternoon, d:Good Night

import java.util.*;

public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice(from a to d): ");
        String choice = sc.next();
        sc.close();

        switch (choice) {
            case "a":
                System.out.println("Good Morning!");
                break;
            case "b":
                System.out.println("Good Afternoon!");
                break;
            case "c":
                System.out.println("Good Evening!");
                break;
            case "d":
                System.out.println("Good Night!");
                break;
            default:
                System.out.println("Invalid Choice!");
        }

    }
}