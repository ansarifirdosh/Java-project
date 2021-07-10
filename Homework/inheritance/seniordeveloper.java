//week 8 tutorial practice
public class seniordeveloper extends developer
{
    private float salary;
    private String joiningdate;
    private String staffroomnumber;
    private int contact;
    private float advancesalary;
    private boolean apponted;
    private boolean terminated;
    public seniordeveloper(String platform,String interviewername,int workinghours,float salsary,int contact)
    {
        super(platform,interviewername,workinghours);
        this.salary=salary;
        this.contact=contact;
        joiningdate="";
        advancesalary=0.0f;
        apponted=true;
        terminated=false;
    }
         public void display()
     {
        
          if(apponted==true)
          {
              System.out.println("termination status"+terminated);
              System.out.println("joining date"+joiningdate);
              System.out.println("Advance salary"+advancesalary);
              System.out.println("contact"+contact);
            }
            else
            {
                System.out.println("developer not appointed");
            }
     }
    }
            
