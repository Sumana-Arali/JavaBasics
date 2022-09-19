package Arrays;
import java.util.*;
import java.io.*;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size: ");
        int row=sc.nextInt();
        System.out.println("enter column size: ");
        int col=sc.nextInt();
        System.out.println("enter  first array  elements: ");
        int[][] arr1=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix 1 elements are: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("enter second array elements: ");
        int[][] arr2=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix 2 elements are: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("The sum of two array elements: ");
        int[][] sum=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
