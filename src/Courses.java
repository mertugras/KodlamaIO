public class Courses {
    int courseId;
    String courseName;


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public Courses(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}
