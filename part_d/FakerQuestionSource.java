package part_d;

import part_b.MCQQuestion;
import part_b.Question;

public class FakerQuestionSource implements QuestionSource {
    @Override
    public Question getQuestion() {
        return new MCQQuestion("Easy", 5);
    }
 
    @Override
    public String toString() {
        return "Question Faker Mode";
    }
}
