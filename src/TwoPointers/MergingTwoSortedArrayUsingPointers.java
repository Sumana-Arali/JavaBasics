package TwoPointers;
import java.util.*;

public class MergingTwoSortedArrayUsingPointers {
    public static void main(String[] args) {
        int [] a=new int[]{3,5,6,9};
        int[] b=new int[]{4,7,8,10};
        int m=a.length;
        int n=b.length;
        int [] result=new int[m+n];
        int i=0,j=0,k=0;
        while(i!=m && j!=n)
        {
            if(a[i]<=b[j])
            {
                result[k]=a[i];
                i++;
                k++;
            }
            else{
                result[k]=b[j];
                j++;
                k++;
            }
        }
        while(i!=m)
        {
            result[k]=a[i];
            i++;
            k++;
        }
        while(j!=n)
        {
            result[k]=b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(result));
        //for(int l=0;l<result.length;l++)
       // {
        //System.out.print(result[l]+" ");
    //}
    }

}
