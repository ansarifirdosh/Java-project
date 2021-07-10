public class Course //creating main class 
{
    private String CourseID; 
    private String CourseName;
    private int Duration;
    private String CourseLeader;
    //making instance object of the class 
    
     Course(String CourseID,String CourseName,int Duration)//making constructor mathod
    {
        this.CourseID=CourseID;//setting values in the field 
        this.CourseName=CourseName;
        this. Duration= Duration;
        this. CourseLeader="";
        //access value stored in subclass
    }
    public String getCourseID()
    {
        return CourseID;
    }
    public String getCourseName()
    {
        return CourseName;
    }
    public int getDuration()
    {
        return Duration;
    }
    public String getCourseLeader()
    {
        return CourseLeader;
    }
    public void setCourseLeader(String CourseLeader)
    {
        this.CourseLeader=CourseLeader;
    }
    void displayCourse()
    {            //displaying value
        System.out.println("The course id is "+CourseID);
        System.out.println("The course name is "+CourseName);
        System.out.println("The course Duration is "+Duration);
        System.out.println("The course Leader is "+CourseLeader);
    }
    
}
        
        
    
    
    
    
    