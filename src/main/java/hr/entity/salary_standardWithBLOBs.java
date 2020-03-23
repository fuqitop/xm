package hr.entity;

public class salary_standardWithBLOBs extends salary_standard {
    private String checkComment;

    private String remark;

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}