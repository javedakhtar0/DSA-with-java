// get two numbers from the user and print thier sum
import java.util.*;

public class addNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = obj.nextInt();
        System.out.print("Sum of the numbers: ");
        obj.close();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
