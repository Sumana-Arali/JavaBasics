package Recursion;
import java.util.*;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

            PrintDecreasingIncreasing(n);


        }

    public static void PrintDecreasingIncreasing(int n)
    {
        if(n==-1)
        {
            return;
        }
        System.out.println(n);
        PrintDecreasingIncreasing(n-1);
        System.out.println(n);
        //PrintIncreasing(n+1);


    }

}
