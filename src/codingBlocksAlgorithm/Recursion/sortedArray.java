package codingBlocksAlgorithm.Recursion;

import java.util.Scanner;

public class sortedArray
{
    public static boolean sort(int[] arr, int index)
    {
        if(index==arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return sort(arr, index+1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println(sort(arr,0));
    }
}
