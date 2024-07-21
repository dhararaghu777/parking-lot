package com.scaler.models;

public class Operator {
    private String operatorId;
    private String operatorName;
    private Gate gate;
    public Operator(String operatorId, String operatorName, Gate gate) {
        this.operatorId = operatorId;
        this.operatorName = operatorName;
        this.gate = gate;
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

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
