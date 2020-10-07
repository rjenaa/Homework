import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testSingleton(){
        Instructors instance = Instructors.getInstance();

        Assert.assertEquals(instance.count(), 1);
    }
}