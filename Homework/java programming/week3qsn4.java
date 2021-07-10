 public class week3qsn4
{
    public static void main(String[]args)
    {
        float mp=6700.50f;
        float sp;
        char cat='D';
        if (cat=='A')
        {
            sp=mp-(mp*60/100);
            System.out.println("the selling price is "+sp);
        }
        else if(cat=='B')
        {
            sp=mp-(mp*40/100);
            System.out.println("the selling price is "+sp);
        }
        else if (cat=='C')
        {
            sp=mp-(mp*20/100);
            System.out.println("the selling price is"+sp);
        }
        else 
        {
            sp=mp;
            System.out.println("the selling price is"+sp);
        }
    }     
}         