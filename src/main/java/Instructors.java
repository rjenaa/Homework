public class Instructors extends People{

    final static Instructors INSTANCE = new Instructors();
    private Instructors(){
        System.out.println("Instance created");
        this.add(new Instructor(12,"Mikaila"));
    }
    public static Instructors getInstance(){
        return  INSTANCE;
    }
}
