package hr.entity;

public class config_question_second_kind {
    private Short secondKindId;

    private String secondKindName;

    private Short firstKindId;

    public Short getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Short secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName;
    }

    public Short getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(Short firstKindId) {
        this.firstKindId = firstKindId;
    }
}