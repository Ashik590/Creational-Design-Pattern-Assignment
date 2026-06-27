package part_b;
import part_d.QuestionSource;
public class MCQFactory extends QuestionFactory {
    @Override
    public MCQQuestion createQuestion(String difficulty, int points) {
        return new MCQQuestion(difficulty, points);
    }

    public MCQFactory(QuestionSource questionSource) {
        super(questionSource);
    }

    @Override
    public MCQQuestionRenderer createRenderer() {
        return new MCQQuestionRenderer();
    }

    @Override
    public MCQEvaluator createEvaluator() {
        return new MCQEvaluator();
    }
}
