package part_c;

public class ExamConfiguration {
    private String title;
    private int duration;
    private int passingScore;
    private boolean negativeMarking;
    private boolean questionShuffle;
    private boolean autoSubmit;
    private boolean calculatorAllowed;

    public ExamConfiguration(ExamConfigurationBuilder builder) {
        this.title = builder.getTitle();
        this.duration = builder.getDuration();
        this.passingScore = builder.getPassingScore();
        this.negativeMarking = builder.isNegativeMarking();
        this.questionShuffle = builder.isQuestionShuffle();
        this.autoSubmit = builder.isAutoSubmit();
        this.calculatorAllowed = builder.isCalculatorAllowed();
    }

    @Override
    public String toString() {
        return "title='" + title + "\'\n" +
                "duration=" + duration + '\n' +
                "passingScore=" + passingScore + '\n' +
                "negativeMarking=" + negativeMarking + '\n' +
                "questionShuffle=" + questionShuffle + '\n' +
                "autoSubmit=" + autoSubmit + '\n' +
                "calculatorAllowed=" + calculatorAllowed + '\n';
    }
}
