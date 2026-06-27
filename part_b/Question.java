package part_b;
public abstract class Question {
    private String difficulty;
    private int points;
    public abstract String getType();

    public Question(String difficulty, int points) {
        this.difficulty = difficulty;
        this.points = points;
    }

    @Override
    public String toString() {
        return "- [Type: " + getType() + "]" + "  Points: " + points + "  Difficulty: " + difficulty + "\n";
    }
}
