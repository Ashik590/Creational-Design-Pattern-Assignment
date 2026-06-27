package part_b;
public class MCQQuestionRenderer implements QuestionRenderer {
    @Override
    public void render(Question question) {
        System.out.println("Rendering MCQ Question: " + question.getType());
    }
    
}
