public class Nestedifelse
{ 
public static void main(String []args)
{
    int a=8;
    int b=7;
    int c=5;
    if(a>b)
    {
        if(a>b)
        {
            System.out.println("greater variable A=" +a);
        }
        else
        {
            System.out.println("greater variable is B="+b);
        }
    }
    else
    {
        if(b>c)
        {
            System.out.println("the greatest number is B=" +b);
        }
        else
        {
            System.out.println("the greatest number isC="+c);
        }
    }
}
}

