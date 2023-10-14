package EX2.Classes;

import java.util.ArrayList;
public class Student {
    protected int studentId ; 
    protected String firstName ;
    protected String lastName ; 
    protected ArrayList<Course> courses ; 
    
    public Student(int id , String firstName , String lastName){
        this.studentId = id ; 
        this.firstName = firstName ;
        this.lastName = lastName ;  
        this.courses = new ArrayList<>(); 
    }

    public int getStudentId(){
        return this.studentId ; 
    }

    public String getFirstName(){
        return this.firstName ; 
    }

    public String getLastName(){
        return this.lastName ; 
    }

    public ArrayList<Course> getCourses(){
        return this.courses; 
    }

    public void enroll (Course course ){
        this.courses.add(course) ; 
    }
}
