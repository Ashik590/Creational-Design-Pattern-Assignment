package part_b;
import part_d.QuestionSource;

public class TrueFalseFactory extends QuestionFactory {
    public TrueFalseFactory(QuestionSource questionSource) {
        super(questionSource);
    }

    public TrueFalseQuestion createQuestion(String difficulty, int points){
        return new TrueFalseQuestion(difficulty, points);
    }

    public TrueFalseQuestionRenderer createRenderer(){
        return new TrueFalseQuestionRenderer();
    }

    public TrueFalseEvaluator createEvaluator(){
        return new TrueFalseEvaluator();
    }
}
