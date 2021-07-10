public class week3qsn2
{
    public static void main(String[]args)
    {
        int n=15;
        int r1=n%3;
        int r2=n%5;
        if(n%3==0&&n%5==0)
        {
            System.out.println("it is divisible by both 3 and 5");
        }
        else
        {
            System.out.println("it is not divisible by both 3 and 5");
        }
    } 
} 