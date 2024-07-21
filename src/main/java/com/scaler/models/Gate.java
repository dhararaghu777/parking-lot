package com.scaler.models;

public class Gate {
    private int gateNo;
    private String gateName;
    private GateType type;

    public Gate(int gateNo, String gateName, GateType type) {
        this.gateNo = gateNo;
        this.gateName = gateName;
        this.type = type;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }
}
