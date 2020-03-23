package hr.entity;

public class human_file_digWithBLOBs extends human_file_dig {
    private String remark;

    private String humanHistroyRecords;

    private String humanFamilyMembership;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHumanHistroyRecords() {
        return humanHistroyRecords;
    }

    public void setHumanHistroyRecords(String humanHistroyRecords) {
        this.humanHistroyRecords = humanHistroyRecords;
    }

    public String getHumanFamilyMembership() {
        return humanFamilyMembership;
    }

    public void setHumanFamilyMembership(String humanFamilyMembership) {
        this.humanFamilyMembership = humanFamilyMembership;
    }
}