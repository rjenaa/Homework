import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(Long id){
        for(Person person: personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person){
        for(Person person1: personList){
            if(personList.equals(person)){
                return true;
            }
        }
        return false;
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(Long id){
        for(Person person: personList){
            if(person.getId() == id){
                personList.remove(person);
            }
        }
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator iterator() {
        return personList.iterator();

        }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
