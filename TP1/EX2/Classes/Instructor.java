package EX2.Classes;

public class Instructor {
    protected int instructorId ; 
    protected String firstName ; 
    protected String lastName ; 

    public Instructor (int id , String firstName , String lastName ){
        this.instructorId= id ; 
        this.firstName = firstName ; 
        this.lastName = lastName  ;
    }

    public int getInstructorId(){return this.instructorId;}

    public String getFirstName(){return this.firstName; }

    public String getLastName(){ return this.lastName; } 
}
