package com.scaler.models;

public abstract class Slot {
    private int slotId;
    private VehicleType vehicleType;
    private Floor floor;
    private  SlotType slotType;

    public Slot(int slotId, VehicleType vehicleType, Floor floor) {
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

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
