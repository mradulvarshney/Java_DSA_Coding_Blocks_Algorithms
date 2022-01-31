package codingBlocksAlgorithm.Recursion;

import java.util.Scanner;

public class move_all_x_at_end
{
    public static String move(String s)
    {
        if(s.length()==0)
            return s;
        String res = move(s.substring(1));
        if(s.charAt(0)!='x')
            return s.charAt(0)+res;
        else
            return res+s.charAt(0);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(move(s));
    }
}
