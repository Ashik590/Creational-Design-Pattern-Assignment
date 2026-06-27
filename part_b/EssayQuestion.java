package part_b;
public class EssayQuestion extends Question {
    @Override
    public String getType() {
        return "Essay";
    }

    public EssayQuestion(String difficulty, int points) {
        super(difficulty, points);
    }
}
