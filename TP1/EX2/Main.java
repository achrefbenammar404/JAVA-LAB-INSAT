package EX2;
import EX2.Classes.*; 
import java.util.ArrayList; 
public class Main {
    public static void main(String[] args ){
        Instructor prof = new Instructor(01, "Boushousha", "Boushousha") ; 
        Course c = new Course(01 , "X" , prof);
        Student s = new Student(01, "Athamthi", "Adhabti") ; 
        s.enroll(c);
        s.enroll(c);

        ArrayList<Course> tableau = s.getCourses();
        for (Course particular_course : tableau ){
            System.out.println(particular_course.getCourseName()); 
        }   

    }
}
