public class calculationSecond extends Calculation
{
    public void factorial(int a)
    {
        int factorial=1;
        for(int i=1;i<=a;i++)
        {
            factorial=factorial*i;
        
        }
        System.out.println("Factorial is"+factorial);
    }
}  