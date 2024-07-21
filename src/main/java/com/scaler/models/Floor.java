package com.scaler.models;

import java.util.List;

public class Floor {
    private int floorNo;
    private String floorName;
    private List<Slot> slots;

    public Floor(int floorNo, String floorName, List<Slot> slots) {
        this.floorNo = floorNo;
        this.floorName = floorName;
        this.slots = slots;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}
