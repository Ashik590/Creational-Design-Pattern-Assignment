package part_d;

import part_b.MCQQuestion;
import part_b.Question;

public class BankQuestionSource implements QuestionSource {
    @Override
    public Question getQuestion() {
        return new MCQQuestion("Medium", 10);
    }

    @Override
    public String toString() {
        return "Question Bank Mode";
    }
}
