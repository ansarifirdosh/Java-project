
public class mycalculation extends calculation
{ 
    
    public void multiplication(int x,int y)
    {
        z=x*y;
        System.out.println("the product"+z);
    }
    public static void main(String[]args)
    {
        int a=5,b=10;
        
        mycalculation demo=new mycalculation();
        demo.addition(a,b);
        demo.subtract(a,b);
        demo.multiplication(a,b);
    }
}
        

    
