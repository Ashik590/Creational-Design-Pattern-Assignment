package part_b;
public class TrueFalseQuestionRenderer implements QuestionRenderer {
    @Override
    public void render(Question question) {
        System.out.println("Rendering True/False Question: " + question.getType());
    }
    
}
