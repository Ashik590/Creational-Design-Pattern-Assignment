package part_a;
public class PracticeExamFactory implements ExamFactory {
    @Override
    public PracticeExam createExam() {
        return new PracticeExam();
    }
    
}
