import static java.lang.System.out;

public class NonAcademicCourse extends Course/*inherits public,protected methods and variables from Course class*/
{
    //private variables, can not be directly accessed by other classes
    private String InstructorName;
    private int Duration;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean IsRegistered;
    private boolean IsRemoved;
    //parameterised constructor is made
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        this.Prerequisite=Prerequisite;
        StartDate="";
        CompletionDate="";
        ExamDate="";
        IsRegistered=false; //change value to false always when object created
    }
    //access values of private variables outside the class
    public String getInstructorName(){
        return InstructorName;
    }

    public int getDuration(){
        return Duration;
    }

    public String getStartDate(){
        return StartDate;
    }

    public String getCompletionDate(){
        return CompletionDate;
    }

    public String getExamDate(){
        return ExamDate;
    }

    public String getPrerequisite(){
        return Prerequisite;
    }

    public boolean getRegistered(){
        return IsRegistered;
    }

    public boolean getRemoved(){
        return IsRemoved;
    }
    //set values of private variables 
    public void setRemoved(boolean IsRemoved){
        this.IsRemoved=IsRemoved;
    }

    public void setInstructorName(String InstructorName){
        if(!IsRegistered){//sets instructorName as per parameter if not set previously or set and cleared
            this.InstructorName=InstructorName;
        }else{
            System.out.println("It is not possible to change instructor name because non academic course has already been registered");
        }
    }
    //set initial value of variable in superclass
    void register(String CourseLeader, String InstructorName, String StartDate, String CompletionDate, String ExamDate){
        if(!IsRegistered){
            setInstructorName(InstructorName);
            this.StartDate=StartDate;
            this.CompletionDate=CompletionDate;
            this.ExamDate=ExamDate;
            IsRegistered=true; //if block will not be executed next time if isRegertered is true
        }else{
            System.out.println("The course has already been registered");
        }
    }
    //reset values
    public void remove(){
        if(IsRemoved){
            System.out.println("The course has been already removed");
        }else{
            super.setCourseLeader("");
            StartDate="";
            CompletionDate="";
            ExamDate="";
            IsRegistered=false; //code blocks to set values And run in another check again and again
            IsRemoved=true;
        }
    }
    //display values if user is registered and values are not empty
    public void display(){
        System.out.println("The Course ID is: "+super.getCourseID()); //called getter methods from superclass  
        System.out.println("The Course Name is: "+super.getCourseName());
        System.out.println("The Duration is: "+super.getDuration());
        if(IsRegistered){
            System.out.println("The Instructor Name is: "+InstructorName);
            System.out.println("The Starting Date is: "+StartDate);
            System.out.println("The Completion Date is: "+CompletionDate);
            System.out.println("The Exam Date is: "+ExamDate);
        }
    }
}