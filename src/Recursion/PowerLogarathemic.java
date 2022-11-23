package Recursion;
import java.util.*;

public class PowerLogarathemic {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
    int xn=PowerLog(x,n);
        System.out.println(xn);
    }
    public static int PowerLog(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int x1=PowerLog(x,n/2);
        int xn=x1*x1;
        if(x%2==1)
        {
            xn=xn*x;
        }
        return xn;
    }
}
