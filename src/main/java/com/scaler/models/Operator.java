package com.scaler.models;

public class Operator {
    private String operatorId;
    private String operatorName;

    public Operator(String operatorId, String operatorName) {
        this.operatorId = operatorId;
        this.operatorName = operatorName;

    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

}
