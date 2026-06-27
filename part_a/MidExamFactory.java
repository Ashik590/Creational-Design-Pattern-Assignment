package part_a;
public class MidExamFactory implements ExamFactory {
    @Override
    public MidExam createExam() {
        return new MidExam();
    }
    
}
