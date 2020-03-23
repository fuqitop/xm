package hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class salary_standard {
    private String standardId;

    private String standardName;

    private String designer;

    private String register;

    private String checker;

    private String changer;

    private Date registTime;

    private Date checkTime;

    private Date changeTime;

    private BigDecimal salarySum;

    private Short checkStatus;

    private Short changeStatus;

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public BigDecimal getSalarySum() {
        return salarySum;
    }

    public void setSalarySum(BigDecimal salarySum) {
        this.salarySum = salarySum;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Short getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Short changeStatus) {
        this.changeStatus = changeStatus;
    }
}