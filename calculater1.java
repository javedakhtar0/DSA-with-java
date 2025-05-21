// get input two numbers and choice from the user to perform the operation like: addition=+,
//subtraction=-, division=/, multiplication=*, modulo=%.

import java.util.*;

public class calculater1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter the choice from(+,-,*,/,%): ");
        String choice = sc.next();
        sc.close();


        switch (choice) {
            case "+":
                System.out.print(num1 + num2);
                break;
            case "-":
                System.out.print(num1 - num2);
                break;
            case "*":
                System.out.print(num1 * num2);
                break;
            case "/":
                System.out.print(num1 / num2);
                break;
            case "%":
                System.out.print(num1 % num2);
                break;
            default:
                System.out.println("Please enter valid choice!");

        }
    }
}
