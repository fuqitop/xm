package hr.entity;

public class engage_major_releaseWithBLOBs extends engage_major_release {
    private String majorDescribe;

    private String engageRequired;

    public String getMajorDescribe() {
        return majorDescribe;
    }

    public void setMajorDescribe(String majorDescribe) {
        this.majorDescribe = majorDescribe;
    }

    public String getEngageRequired() {
        return engageRequired;
    }

    public void setEngageRequired(String engageRequired) {
        this.engageRequired = engageRequired;
    }
}