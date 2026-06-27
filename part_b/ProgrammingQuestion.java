package part_b;
public class ProgrammingQuestion extends Question {
    @Override
    public String getType() {
        return "Programming";
    }

    public ProgrammingQuestion(String difficulty, int points) {
        super(difficulty, points);
    }
}
