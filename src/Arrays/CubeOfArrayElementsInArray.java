package Arrays;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class CubeOfArrayElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //cube of arrays
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i]*arr[i];
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");


    }

}
