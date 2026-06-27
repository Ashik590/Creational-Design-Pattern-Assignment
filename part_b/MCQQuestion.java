package part_b;
public class MCQQuestion extends Question {
    @Override
    public String getType() {
        return "MCQ";
    }

    public MCQQuestion(String difficulty, int points) {
        super(difficulty, points);
    }
}
