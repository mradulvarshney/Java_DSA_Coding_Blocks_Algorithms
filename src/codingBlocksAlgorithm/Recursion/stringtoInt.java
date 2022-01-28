package codingBlocksAlgorithm.Recursion;

public class stringtoInt
{
    static int sum=0;
    public static int convert(String s)
    {
        if(s.length()==0)
            return sum;
        char c = s.charAt(0);
        sum= 10*sum +Integer.parseInt(String.valueOf(c));
        return convert(s.substring(1));
    }
    public static void main(String[] args)
    {
        String s = "00102009";
        System.out.println("String number: "+s);
        System.out.println("Integer number: "+convert(s));
    }
}
