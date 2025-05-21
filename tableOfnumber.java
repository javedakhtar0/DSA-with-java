// take a umber from the user and print the table of that number using for or while loop.

import java.util.Scanner;

public class tableOfnumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in); // use Scanner class to get inputs
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); // get input by the user
        sc.close();
        int i = 1;
        while (i <= 10) {
            System.out.print(i * num+"\t");
            i++;
        }

    }
}
