package hr.entity;

import java.util.Date;

public class engage_subjects {
    private Short subId;

    private Short secondKindId;

    private String register;

    private Date registTime;

    private String derivation;

    private String correctKey;

    private String changer;

    private Date changeTime;

    public Short getSubId() {
        return subId;
    }

    public void setSubId(Short subId) {
        this.subId = subId;
    }

    public Short getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Short secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public String getCorrectKey() {
        return correctKey;
    }

    public void setCorrectKey(String correctKey) {
        this.correctKey = correctKey;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}