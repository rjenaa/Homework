import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    People people = new People();

    @Test
    public void testAdd(){
        Person person = new Person(1l, "John");
        Person person1 = new Person(2L, "Jane");
        people.add(person);
        people.add(person1);
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testRemove(){
        Person person = new Person(1l, "John");
        Person person1 = new Person(2L, "Jane");
        people.add(person);
        people.add(person1);
        people.remove(person1);
        Assert.assertFalse(people.contains(person1));
    }

    @Test
    public void testFindById(){
        Person person = new Person(1l, "John");
        Person person1 = new Person(2L, "Jane");
        people.add(person);
        people.add(person1);
        Person expected = person1;
        Person actual = people.findById(2L);

        Assert.assertEquals(expected,actual);
    }



}
