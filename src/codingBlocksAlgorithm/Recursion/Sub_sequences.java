package codingBlocksAlgorithm.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub_sequences
{
    public static void subSequences(String s, String out)
    {
        if (s.length() == 0)
        {
            System.out.print(out+" ");
            return;
        }
        char ch = s.charAt(0);
        s = s.substring(1);
        subSequences(s, out);
        subSequences(s, out + ch);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        subSequences(sc.next(),"");
    }
}
