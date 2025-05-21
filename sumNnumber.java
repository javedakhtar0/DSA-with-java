
//print the sum of n natural numbers using while loop.
import java.util.*;

public class sumNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0, i = 1;
        sc.close();


        while (i <= num) {
            System.out.print(i + "\t");
            sum = sum + i;
            i++;
        }
        System.out.print("\nSum: " + sum);
    }
}
