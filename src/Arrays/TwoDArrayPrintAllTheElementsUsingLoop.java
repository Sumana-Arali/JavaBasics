package Arrays;
import java.util.*;
import java.io.*;

public class TwoDArrayPrintAllTheElementsUsingLoop {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter row size: ");
       int row=sc.nextInt();
        System.out.println("enter column size: ");
       int col=sc.nextInt();
        System.out.println("enter array elements: ");
       int[][] arr1=new int[row][col];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               arr1[i][j]=sc.nextInt();
           }
       }
        System.out.println("The matrix elements are: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
