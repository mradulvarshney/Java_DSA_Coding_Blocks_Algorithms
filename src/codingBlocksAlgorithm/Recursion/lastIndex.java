package codingBlocksAlgorithm.Recursion;

import java.util.Scanner;

public class lastIndex
{
    public static int lastindex(int[] arr, int search, int n)
    {
        if(n==-1)
            return -1;
        if(arr[n]==search)
            return n;
        return lastindex(arr, search, n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int search=sc.nextInt();
        int index=lastindex(arr,search,arr.length-1);
        if(index==-1)
            System.out.println("-1");
        else
            System.out.println(index);
    }
}
