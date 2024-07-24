package com.scaler.models;

public class Slot {
    private int slotId;
    private VehicleType vehicleType;
    private int floor;
    private  SlotType slotType;

    public Slot(int slotId, VehicleType vehicleType, int floor) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.floor = floor;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
