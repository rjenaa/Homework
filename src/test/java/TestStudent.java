import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(8L, "Ray");

        Assert.assertTrue(student instanceof ILearner);


    }

    @Test
    public void testInheritance(){
        Student student = new Student(8L, "Ray");

        Assert.assertTrue(student instanceof Person);

    }
    @Test
    public void testLearn(){
        Student student = new Student(8L, "Ray");
        student.learn(20.0);
        double expected = 20.0;
        double actual = student.getTotalStudyTime();
        boolean comparison = expected == actual;
        Assert.assertTrue(comparison);

    }
}
