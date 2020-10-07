public class Students extends People{
    final static Students INSTANCE = new Students();
    private Students(){
        System.out.println("Instance created");
        this.add(new Student(1L, "comatose"));
        this.add(new Student(2L, "Hashbrown"));
        this.add(new Student(3L, "jaysleh"));
        this.add(new Student(4L, "black excellence"));
        this.add(new Student(5L, "yassss"));
        this.add(new Student(6L, "dean da dream"));
        this.add(new Student(7L, "sea bass"));
        this.add(new Student(8L, "evil genius"));
        this.add(new Student(9L, "berry white"));
        this.add(new Student(10L, "vanilla ice"));

    }
    public static Students getInstance(){
        return  INSTANCE;
    }
}
