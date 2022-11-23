package Recursion;
import java.util.*;
//understanding Euler's Path
public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Printzigzag(n);
    }
    public static void Printzigzag(int n){
    if(n==0)
    {
        return ;
    }
        System.out.println(" Pre " + n);
    Printzigzag(n-1);
        System.out.println(" In "+ n);
        Printzigzag(n-1);
        System.out.println(" Post " + n);


    }
}
