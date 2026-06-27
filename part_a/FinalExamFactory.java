package part_a;

public class FinalExamFactory implements ExamFactory {
    @Override
    public FinalExam createExam() {
        return new FinalExam();
    }
    
}
