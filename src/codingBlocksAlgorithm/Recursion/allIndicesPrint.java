package codingBlocksAlgorithm.Recursion;

import java.util.Scanner;

public class allIndicesPrint
{
    public static int[] print(int[] arr, int num, int index, int count)
    {
        if(index==arr.length)
        {
            int[] arr2 = new int[count];
            return arr2;
        }
        int[] arr1 = null;
        if(arr[index]==num)
        {
            arr1 = print(arr, num, index + 1, count + 1);
            arr1[count] = index;
            return arr1;
        }
        else
            return print(arr, num, index+1, count);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter no. to search.");
        int num = sc.nextInt();
        int[] indices = print(arr, num, 0,0);
        for(int i=0;i<indices.length;i++)
            System.out.println(indices[i]+ " ");
    }
}
