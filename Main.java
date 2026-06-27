import part_a.ExamFactory;
import part_a.MidExamFactory;
import part_c.ExamConfiguration;
import part_c.ExamConfigurationBuilder;
import part_d.QuestionSource;
import part_d.BankQuestionSource;
import part_b.QuestionFactory;
import part_b.TrueFalseFactory;
import part_b.ProgrammingFactory;
import part_b.MCQFactory;
import part_b.EssayFactory;
import part_b.Question;
import part_a.Exam;

public class Main {
    public static void main(String[] args) {
        ExamFactory examFactory = new MidExamFactory();
        Exam midExam = examFactory.createExam();
        ExamConfiguration examConfig = new ExamConfigurationBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setQuestionShuffle(true)
                .setAutoSubmit(true)
                .setCalculatorAllowed(false)
                .build();

        QuestionSource questionSource = new BankQuestionSource();

        QuestionFactory mcqFactory = new MCQFactory(questionSource);
        QuestionFactory trueFalseFactory = new TrueFalseFactory(questionSource);
        QuestionFactory programmingFactory = new ProgrammingFactory(questionSource);    
        QuestionFactory essayFactory = new EssayFactory(questionSource);

        Question q1 = mcqFactory.createQuestion("Medium", 2);
        Question q2 = mcqFactory.createQuestion("Easy", 2);
        Question q3 = essayFactory.createQuestion("Hard", 10);
        Question q4 = programmingFactory.createQuestion("Hard", 20);
        Question q5 = trueFalseFactory.createQuestion("Easy", 1); 

        // output

        System.out.println();
        System.out.println("================================");
        System.out.println("Exam Created Successfully");
        System.out.println("================================");
        System.out.println();

        System.out.println("Exam Type: " + midExam.getType() + "\n");
        System.out.println(examConfig.toString());
        System.out.println("Question Sourcing Strategy: " + questionSource.toString());
        System.out.println("Compiled Structural Components:");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
        System.out.println(q5);
    }
}
