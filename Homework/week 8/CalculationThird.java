public class CalculationThird extends calculationSecond
{
    public void fibonacci()
    {
        int a=1,b=1,c=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
