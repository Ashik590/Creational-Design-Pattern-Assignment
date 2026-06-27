package part_c;

public class ExamConfigurationBuilder {
    private String title;
    private int duration;
    private int passingScore;
    private boolean negativeMarking;
    private boolean questionShuffle;
    private boolean autoSubmit;
    private boolean calculatorAllowed;
    
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public boolean isNegativeMarking() {
        return negativeMarking;
    }

    public boolean isQuestionShuffle() {
        return questionShuffle;
    }

    public boolean isAutoSubmit() {
        return autoSubmit;
    }

    public boolean isCalculatorAllowed() {
        return calculatorAllowed;
    }


    public ExamConfigurationBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ExamConfigurationBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public ExamConfigurationBuilder setPassingScore(int passingScore) {
        this.passingScore = passingScore;
        return this;
    }

    public ExamConfigurationBuilder setNegativeMarking(boolean negativeMarking) {
        this.negativeMarking = negativeMarking;
        return this;
    }

    public ExamConfigurationBuilder setQuestionShuffle(boolean questionShuffle) {
        this.questionShuffle = questionShuffle;
        return this;
    }

    public ExamConfigurationBuilder setAutoSubmit(boolean autoSubmit) {
        this.autoSubmit = autoSubmit;
        return this;
    }

    public ExamConfigurationBuilder setCalculatorAllowed(boolean calculatorAllowed) {
        this.calculatorAllowed = calculatorAllowed;
        return this;
    }

    public ExamConfiguration build() {
        if(title == null) {
            throw new IllegalStateException("Title is required");
        }

        if(duration <= 0) {
            throw new IllegalStateException("Duration is required");
        }

        if(passingScore < 0) {
            throw new IllegalStateException("Passing score can not be negative");
        }


        return new ExamConfiguration(this);
    }
}
