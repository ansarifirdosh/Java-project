public class week3qsn5
{
    public static void main(String[]args)
    {
        float mp=5600f;
        char cat='E';
        float sp=0;
        switch(cat)
        {
            case'A':
            sp=mp-(mp*60/100);
            break;
            case 'B':
            sp=mp-(mp*40/100);
            break;
            case 'c':
            sp=mp-(mp*20/100);
            break;
            case'D':
            sp=mp-(mp*10/100);
            break;
            default:
            System.out.println("no discunt");
        }
        System.out.println("selling price is"+sp);
    }
}
    
 