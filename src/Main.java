import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Courses> courses1=new ArrayList<>();
        courses1.add(new Courses(1,"Java"));
        courses1.add(new Courses(2,".Net"));
        Student student1=new Student(1,"Mert","Uğraş","mert@mert.com","1234",courses1);
        UserManager userManager=new UserManager();
        userManager.add(student1);
        registeredCourses(student1);

    }

    public static void registeredCourses(Student student){
        for (Courses cours: student.getRegisteredCourses()){
            System.out.println("Kurs İsmi "+cours.getCourseName());
        }


    }
}
