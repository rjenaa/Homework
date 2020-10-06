public class Instructor extends Person implements ITeacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(ILearner[] learner, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / learner.length;
        for(ILearner learner1: learner){
            learner1.learn(numberOfHoursPerStudent);
        }
    }
}
