package Arrays;
import java.util.*;
import java.io.*;

public class CheckPrimeInArray {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }



    }
}
