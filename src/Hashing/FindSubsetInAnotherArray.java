package Hashing;
import java.util.HashSet;

public class FindSubsetInAnotherArray {
    public static boolean isSubset(int a[],int b[],int m,int n) {
        HashSet<Integer> hset= new HashSet<>();
        for(int i=0;i<m;i++)
        {
            if(!hset.contains(a[i]))
                hset.add(a[i]);
        }

        for(int i=0;i<n;i++)
        {
            if(!hset.contains(b[i]))
                return false;
        }
        return true;


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,2,3};
        int m=a.length;
        int n=b.length;

        if(isSubset(a,b,m,n))
            System.out.println("b is a subset of a");
        else
            System.out.println("b is not a subset of a");

    }
}


