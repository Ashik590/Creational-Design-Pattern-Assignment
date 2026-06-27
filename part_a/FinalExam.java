package part_a;
public class FinalExam implements Exam {
    @Override
    public String getType() {
        return "Final Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam - " + getType());
    }
    
}
