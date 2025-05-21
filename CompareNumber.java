
//get two number from the user and compare that numbers and print them
import java.util.*;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();


        if (num1 > num2) {
            System.out.println(" num1 is greater ");
        } else if (num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("num1 is lesser");
        }
    }
}
