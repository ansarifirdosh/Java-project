public class AcademicCourse extends Course //creating academicclass that is subclass of Course
{
    private String LecturerName; 
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberOfAssessments;
    private boolean IsRegistered;
    private boolean CourseRemovedStatus;
    //defining data making instance object of the class
    
     AcademicCourse( String CourseID,String CourseName,int Duration,String Level,String Credit,int NumberOfAssessments)
     //set up initial values
    {
        super(CourseID,CourseName,Duration);
        LecturerName="";
        StartingDate="";
        CompletionDate="";
        IsRegistered=false; /*non premitive datatype gets defaultValue false but the value has to be set here for the variable to reset 
        its value every time the constructor object is invoked(called)*/
    
    }
     //access values stored in private variables outside the class
    public String getLecturerName()
    {
        return LecturerName;
    }
    public String getLevel()
    {
        return Level;
    }
    public String getCredit()
    {
        return Credit;
    }
    public String getStartingDate()
    {
        return StartingDate;
    }
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    public int getNumberOfAssessments()
    {
        return NumberOfAssessments;
    }
    public boolean getIsRegistered()
    {
        return IsRegistered;
    }
    public void setLecturerName(String LecturerName)
    {
        this.LecturerName=LecturerName;
    }
    public void setNumberOfAssessments(int NumberOfAssessments)
    {
        this. NumberOfAssessments= NumberOfAssessments;
    } //set initial value(register value) of variable in superclass if not registered
    //else display values
    void register(String CourseLeader,String LecturerName,String StartingDate,String CompletionDate)
    {
        if(IsRegistered)
        {
        System.out.println("The Lecturer name is "+LecturerName);
        System.out.println("The Starting date is "+StartingDate);
        System.out.println("The completion date is "+CompletionDate);
        }
    
        else
        {
        super.setCourseLeader(CourseLeader);
        this.LecturerName= LecturerName;
        this.StartingDate=StartingDate;
        this.CompletionDate=CompletionDate;
        IsRegistered=true;
        CourseRemovedStatus=false;
        }
    }
        void display()
         {super.displayCourse();
            if(IsRegistered)
            { System.out.println("The leturer name is "+LecturerName);
              System.out.println("The level is "+Level);
              System.out.println("the credit is "+Credit);
              System.out.println("The course Starting date is "+StartingDate);
              System.out.println("The completion date is "+CompletionDate);
              System.out.println("The number of assignments is "+NumberOfAssessments);
            }
            
        }
    
}
        
        hello firdosh=new hello
    
    
    
    
    
    
