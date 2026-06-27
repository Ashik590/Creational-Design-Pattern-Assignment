package part_a;
public class PracticeExam implements Exam {
    @Override
    public String getType() {
        return "Practice Quiz";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam - " + getType());
    }
}
