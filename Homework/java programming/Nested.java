public class Nested
{
    public static void main(String[]arg)
    {
        int n=15;
        {   
           if(n%5==0)
           {
                if(n%3==0)
                {
               System.out.println("divisible by both 5 and 3");
                }
            else 
               {
                System.out.println("divisible by 5");
               }
           }
           else
        
          {
            System.out.println("divisible by 3 ");
          }
          
    }
}
}