package part_b;
public class EssayQuestionRenderer implements QuestionRenderer {
    @Override
    public void render(Question question) {
        question = (EssayQuestion) question;
        System.out.println("Rendering Essay Question: " + question.getType());
    }
}
