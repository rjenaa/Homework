import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testSingleton(){
        Students students = Students.getInstance();

        Assert.assertEquals(students.personList.stream().count(),10);
    }
}
