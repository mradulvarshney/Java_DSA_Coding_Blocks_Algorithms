package codingBlocksAlgorithm.Recursion;

import java.util.Scanner;

public class replace_All_PI
{
    public static String replace(String s, int n, String ss)
    {
        if(n==s.length())
            return ss;
        if(s.charAt(n)=='p' && s.charAt(n+1)=='i')
        {
            ss+=3.14;
            return replace(s,n+2, ss);
        }
        else
        {
            ss += s.charAt(n);
            return replace(s, n + 1, ss);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i=0; i<n;i++)
        {
            System.out.println(replace(sc.next(), 0, ""));
        }
    }
}
