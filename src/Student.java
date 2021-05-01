import java.util.ArrayList;

public class Student extends User{
    ArrayList<Courses> registeredCourses;

    public Student(int id, String name, String surName, String userMail, String password, ArrayList<Courses> registeredCourses) {
        super(id, name, surName, userMail, password);
        this.registeredCourses = registeredCourses;
    }

    public ArrayList<Courses> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(ArrayList<Courses> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
