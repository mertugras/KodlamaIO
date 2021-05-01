import java.util.ArrayList;

public class StudentManager extends UserManager{

    public ArrayList<Courses> getRegisterCourser(Student student){
        return student.registeredCourses;
    }

    }

