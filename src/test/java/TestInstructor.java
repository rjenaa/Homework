import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    private static final double DELTA = 1e-15;

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(8L, "Marissa");

        Assert.assertTrue(instructor instanceof ITeacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(8L, "Marissa");

        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(8L, "Marissa");
        Student student = new Student(9L, "Ray");

        instructor.teach(student,20.0);

        double expected = 20;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual, DELTA);
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(8L, "Marissa");
        Student student = new Student(9L, "Ray");
        Student student1 = new Student(10L, "John");

        Student[] arrOfStudents = {student, student1};

        double numberOfHours = 20.0;

        instructor.lecture(arrOfStudents,numberOfHours);

        double expected = numberOfHours/ arrOfStudents.length;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual, DELTA);
    }

}
