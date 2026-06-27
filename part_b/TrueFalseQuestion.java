package part_b;

public class TrueFalseQuestion extends Question {
    @Override
    public String getType() {
        return "True/False";
    }

    public TrueFalseQuestion(String difficulty, int points) {
        super(difficulty, points);
    }
}
