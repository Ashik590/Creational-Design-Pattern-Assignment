package part_b;
public class ProgrammingQuestionRenderer implements QuestionRenderer {
    @Override
    public void render(Question question) {
        System.out.println("Rendering Programming Question: " + question.getType());
    }
    
}
