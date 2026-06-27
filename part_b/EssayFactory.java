package part_b;
import part_d.QuestionSource;

public class EssayFactory extends QuestionFactory {
    @Override
    public EssayQuestion createQuestion(String difficulty, int points) {
        return new EssayQuestion(difficulty, points);
    }

    public EssayFactory(QuestionSource questionSource) {
        super(questionSource);
    }

    @Override
    public EssayQuestionRenderer createRenderer() {
        return new EssayQuestionRenderer();
    }

    @Override
    public EssayEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}
