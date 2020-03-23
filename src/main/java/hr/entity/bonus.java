package hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class bonus {
    private Short bonId;

    private String majorKindId;

    private String majorKindName;

    private String majorId;

    private String majorName;

    private String humanId;

    private String humanName;

    private String bonusItem;

    private BigDecimal bonusWorth;

    private String bonusDegree;

    private String register;

    private String checker;

    private Date registTime;

    private Date checkTime;

    private Short checkStatus;

    private String remark;

    public Short getBonId() {
        return bonId;
    }

    public void setBonId(Short bonId) {
        this.bonId = bonId;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId;
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getBonusItem() {
        return bonusItem;
    }

    public void setBonusItem(String bonusItem) {
        this.bonusItem = bonusItem;
    }

    public BigDecimal getBonusWorth() {
        return bonusWorth;
    }

    public void setBonusWorth(BigDecimal bonusWorth) {
        this.bonusWorth = bonusWorth;
    }

    public String getBonusDegree() {
        return bonusDegree;
    }

    public void setBonusDegree(String bonusDegree) {
        this.bonusDegree = bonusDegree;
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

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}