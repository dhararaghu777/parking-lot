package com.scaler.models;

import com.scaler.repositories.SlotRepository;

import java.util.*;

public class ParkingLot {
    private String parkingLotId;
    private String parkingLotName;
    private final Set<Integer> availableSlots;
    private final Set<Integer> occupiedSlots;
    private final Set<Integer> availableFloors;
    private final Set<String> operators;
    private int parkingLotCapacity;

    public ParkingLot(String parkingLotId, String parkingLotName, int parkingLotCapacity) {
        this.parkingLotId = parkingLotId;
        this.parkingLotName = parkingLotName;
        this.parkingLotCapacity = parkingLotCapacity;
        this.availableSlots = new HashSet<>();
        this.availableFloors = new HashSet<>();
        this.occupiedSlots = new HashSet<>();
        this.operators = new HashSet<>();
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public int getParkingLotCapacity() {
        return parkingLotCapacity;
    }
    public void setParkingLotCapacity(int parkingLotCapacity) {
        this.parkingLotCapacity = parkingLotCapacity;
    }
    public Set<Integer> getAvailableSlots() {
        return availableSlots;
    }
    public void addSlot(Integer slotId) {
        if(availableSlots.size() < parkingLotCapacity) {
            if(availableSlots.contains(slotId)) throw  new RuntimeException("Slot already present");
            availableSlots.add(slotId);
        }else throw  new RuntimeException("Parking lot is full");
    }
    public boolean removeSlot(Integer slotId) {
       return availableSlots.remove(slotId);
    }
    public int getAvailableFloors() {
        return availableFloors.size();
    }
    public void addFloor(int floorId) {
        availableFloors.add(floorId);
    }
    public boolean removeFloor(int floorId) {
        return availableFloors.remove(floorId);
    }
    public void occupySlot(Integer slotId) {
        if(occupiedSlots.contains(slotId)) throw  new RuntimeException("Slot already occupied");
        if(availableSlots.isEmpty()) throw  new RuntimeException("Slot is empty");
        occupiedSlots.add(slotId);
    }
    public boolean releaseSlot(Integer slotId) {
        return occupiedSlots.remove(slotId);
    }

    public void addOperator(String operatorId){
        operators.add(operatorId);
    }
    public boolean removeOperator(String operatorId){
        return operators.remove(operatorId);
    }
}
