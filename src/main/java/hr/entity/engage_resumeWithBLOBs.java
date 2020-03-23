package hr.entity;

public class engage_resumeWithBLOBs extends engage_resume {
    private String humanHistoryRecords;

    private String remark;

    private String recomandation;

    public String getHumanHistoryRecords() {
        return humanHistoryRecords;
    }

    public void setHumanHistoryRecords(String humanHistoryRecords) {
        this.humanHistoryRecords = humanHistoryRecords;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRecomandation() {
        return recomandation;
    }

    public void setRecomandation(String recomandation) {
        this.recomandation = recomandation;
    }
}