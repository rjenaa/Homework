import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington extends People {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington() {
        System.out.println("Instance created");


    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture((ILearner[]) students.personList.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        for (int i = 0; i < Instructors.getInstance().personList.size(); i++) {
            if (Instructors.getInstance().personList.get(i) instanceof Instructor &&
                    id == ((Instructor) Instructors.getInstance().personList.get(i)).getId()) {
                ((Instructor) Instructors.getInstance().personList.get(i)).lecture((ILearner[]) Students.getInstance().personList.toArray(),numberOfHours);
            }
        }
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studentDoubleMap = new HashMap<Student,Double>();
        for(int i = 0; i < Students.getInstance().count();i++){
            double studyTime = ((Student) Students.getInstance().personList.get(i)).getTotalStudyTime();
            studentDoubleMap.put(((Student) Students.getInstance().personList.get(i)), studyTime);
        }
        return studentDoubleMap;
    }

}