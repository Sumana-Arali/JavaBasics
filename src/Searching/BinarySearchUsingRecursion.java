package Searching;

public class BinarySearchUsingRecursion {
    static int binaryrecursion(int arr[],int key,int first,int last){
        if(last>=first)
        {
            int mid=first+(last-first)/2;
            if(arr[mid]==key) {
                return mid;
            }
            if(arr[mid]>key){
                return binaryrecursion(arr,first,mid-1,key);
            }
            else{
                return binaryrecursion(arr,last,mid+1,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{20,40,55,60};
        int key=40;
        int last=arr.length-1;
        int result=binaryrecursion(arr,key,0,last);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }


    }
}
