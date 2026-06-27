package part_b;

import part_d.QuestionSource;

public abstract class QuestionFactory {
    private QuestionSource questionSource;

    public QuestionFactory(QuestionSource questionSource) {
        this.questionSource = questionSource;
    }

    public abstract Question createQuestion(String difficulty, int points);
    public abstract QuestionRenderer createRenderer();
    public abstract QuestionEvaluator createEvaluator();
}
