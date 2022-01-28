package codingBlocksAlgorithm.Recursion;

public class duplicateCharaterFormatting
{
    static String str ="";
    public static String format(String s)
    {
        if(s.length()==1)
        {
            str+=s.substring(0);
            return str;
        }
        if(s.charAt(0)==s.charAt(1))
            str = str + s.substring(0, 1) + "*" ;
        else
            str+=s.substring(0,1);
        return format(s.substring(1));
    }
    public static void main(String[] args)
    {
        System.out.println("String after formatting: "+ format("aabcaabba"));
    }
}
