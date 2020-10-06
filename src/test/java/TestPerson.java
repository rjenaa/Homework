import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        String name = "Ray";
        Long id = 8L;
        Person person = new Person(id,name);

        Assert.assertEquals(name, person.getName());
        Long actual = person.getId();
        Assert.assertEquals(id, actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person(8L,"Bob");
        String name= "Ray";
        person.setName(name);

        Assert.assertEquals(name,person.getName());
    }
}
