import org.junit.Test;

public class TestZipCode {
    @Test
    public void testLecture(){
        Students students= Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        ITeacher Mikaila = new Instructor(89,"Mikaila");
        double number = 10.0;
        zipCodeWilmington.hostLecture(Mikaila,number);

    }


}
