package codingBlocksAlgorithm.Recursion;

public class removeDuplicates
{
    static String str ="";
    public static String format(String s)
    {
        if(s.length()==1)
        {
            str+=s.substring(0);
            return str.substring(0,str.length()-1);
        }
        if(s.charAt(0)==s.charAt(1))
        {
            str += s.substring(0, 1);
            return format(s.substring(2));
        }
        else
        {
            str += s.substring(0, 1);
            return format(s.substring(1));
        }
    }
    public static void main(String[] args)
    {
        String s = "aaba";
        s+=" ";
        System.out.println("String after formatting: "+ format(s));
    }
}
