package part_b;

import part_d.QuestionSource;

public class ProgrammingFactory extends QuestionFactory {
    @Override
    public ProgrammingQuestion createQuestion(String difficulty, int points) {
        return new ProgrammingQuestion(difficulty, points);
    }

    public ProgrammingFactory(QuestionSource questionSource) {
        super(questionSource);
    }


    @Override
    public ProgrammingQuestionRenderer createRenderer() {
        return new ProgrammingQuestionRenderer();
    }

    @Override
    public ProgrammingEvaluator createEvaluator() {
        return new ProgrammingEvaluator();
    }
    
}
