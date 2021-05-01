public class InstructorManager extends UserManager{
    Instructor instructor;

    public InstructorManager(Instructor instructor) {
        this.instructor = instructor;
    }

    public String instructorName(Instructor instructor){
    return instructor.getName();
    }
}
