package hr.entity;

public class engage_interviewWithBLOBs extends engage_interview {
    private String interviewComment;

    private String checkComment;

    public String getInterviewComment() {
        return interviewComment;
    }

    public void setInterviewComment(String interviewComment) {
        this.interviewComment = interviewComment;
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment;
    }
}