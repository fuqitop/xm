package hr.entity;

public class config_major {
    private Integer majorId;

    private String majorName;

    private Integer majorKindId;

    private Integer testAmount;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(Integer majorKindId) {
        this.majorKindId = majorKindId;
    }

    public Integer getTestAmount() {
        return testAmount;
    }

    public void setTestAmount(Integer testAmount) {
        this.testAmount = testAmount;
    }
}