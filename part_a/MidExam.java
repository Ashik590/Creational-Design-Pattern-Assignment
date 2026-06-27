package part_a;
public class MidExam implements Exam {
    @Override
    public String getType() {
        return "Midterm Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam - " + getType());
    }
    
}
