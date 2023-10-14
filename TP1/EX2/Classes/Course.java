package EX2.Classes ; 

public class Course{
    protected int courseId  ;
    protected String courseName ;
    protected Instructor Inst ; 

    public Course (int id , String courseName , Instructor ins){
        this.courseId = id ; 
        this.courseName = courseName ;
        this.Inst = ins ; 
    }

    public int getCourseId(){return this.courseId; }

    public String getCourseName(){return this.courseName; }

    public Instructor getInstructor(){ return this.Inst; }

}