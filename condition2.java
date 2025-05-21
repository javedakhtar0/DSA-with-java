
//get two numbers and an option from the user and show the result on the basis of the give option
import java.util.*;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // getting input from the user
        System.out.print("Enter the first number:  ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the option from these(1=sum,2=sub,3=mul,4=div,5=mod): ");
        int c = sc.nextInt();
        sc.close();

        // using switch case we'll identify the right option and perform the action
        switch (c) {
            case 1:
                System.out.print("addition:" + (a + b)+"\n");
                break;
            case 2:
                System.out.print("Subtraction:" + (a - b)+"\n");
                break;
            case 3:
                System.out.print("Multiplication:" + (a * b)+"\n");
                break;
            case 4:
                System.out.print("Division:" + (a / b)+"\n");
                break;
            case 5:
                System.out.print("MOdulo:" + (a % b)+"\n");
                break;
            default:
                System.out.println("Incorrect choice!"+"\n");
                break;
        }

    }
}
