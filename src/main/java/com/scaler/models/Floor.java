package com.scaler.models;

import java.util.List;
import java.util.Map;

public class Floor {
    private int floorNo;
    private String floorName;
    private Map<Integer, Slot> slotMap;

    public Floor(int floorNo, String floorName) {
        this.floorNo = floorNo;
        this.floorName = floorName;
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

    public Slot getSlot(int slotId) {
        if(!slotMap.containsKey(slotId)) throw new RuntimeException("Slot not found");
        return slotMap.get(slotId);
    }

   public void addSlot(Slot slot) {
        slotMap.put(slot.getSlotId(), slot);
   }
}
