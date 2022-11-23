package Recursion;
import java.util.*;
//Calculating x power n
public class PowerLinear {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
        System.out.println(PowerLinear(x,n));

    }
    public static int PowerLinear(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int x1=PowerLinear(x,n-1);
        int x2=x * x1;
        return x2;
    }
}
