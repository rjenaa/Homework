public class Main {
    public static void main(String[] args) {
        Student student = new Student(1L, "comatose");
        Student student1 = new  Student(2L, "Hashbrown");

        Students students = Students.getInstance();

        for (Object s: students.personList){
            System.out.println(s);
        }
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        ITeacher Mikaila = new Instructor(89,"Mikaila");
        double number = 10.0;
        zipCodeWilmington.hostLecture(Mikaila,number);

        for(int i = 0; i < Students.getInstance().count();i++){
            double studyTime = ((Student) Students.getInstance().personList.get(i)).getTotalStudyTime();
            System.out.println(((Student) Students.getInstance().personList.get(i)) + " time: " + studyTime);
        }





    }
}
