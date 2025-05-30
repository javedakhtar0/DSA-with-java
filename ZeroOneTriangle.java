// 0-1 triangle

import java.util.*;

public class ZeroOneTriangle {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the triangle:");
        int len=sc.nextInt();
        sc.close();

        for(int i=1;i<=len;i++)
        {
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }
}
