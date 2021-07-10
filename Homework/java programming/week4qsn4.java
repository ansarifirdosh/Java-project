public class week4qsn4
{
    public static void main(String[]arg)
    {
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=10;i++)
        {
           System.out.print(a+",");
           c=a+b;
           a=b;
           b=c;
        }
    }
}