package hr.entity;

public class engage_exam_details {
    private Short exdId;

    private String examNumber;

    private Short secondKindId;

    private Short questionAmount;

    public Short getExdId() {
        return exdId;
    }

    public void setExdId(Short exdId) {
        this.exdId = exdId;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    public Short getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Short secondKindId) {
        this.secondKindId = secondKindId;
    }

    public Short getQuestionAmount() {
        return questionAmount;
    }

    public void setQuestionAmount(Short questionAmount) {
        this.questionAmount = questionAmount;
    }
}