package Arrays;
import java.io.*;
import java.util.*;
public class ArenaQ {
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int [] A=new int[N];
            for(int i=0;i<N;i++)
            {
                A[i]=sc.nextInt();
            }
            int [] B=new int[N-1];
            int diff=0;
            int j=N-1;
            for(int i=0;i<N;i++)
            {
                for(int k=0;k<B.length;k++){
                    diff=Math.abs(A[i]-A[j]);
                    B[k]=diff;
                }
                diff=0;
            }
            int sum=0;
            for(int i=0;i<B.length;i++)
            {
                sum=sum+B[i];
            }
            System.out.println(sum);
        }
    }
