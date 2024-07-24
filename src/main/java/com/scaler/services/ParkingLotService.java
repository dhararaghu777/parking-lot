package com.scaler.services;

import com.scaler.dtos.OperatorDto;
import com.scaler.dtos.SlotDto;
import com.scaler.models.*;
import com.scaler.repositories.OperatorRepository;
import com.scaler.repositories.SlotRepository;

import java.util.Optional;

public class ParkingLotService {
    private ParkingLot parkingLot;

    public ParkingLotService(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void addSlot(SlotDto slotDto){
        Optional<Slot> slot= SlotRepository.getSlotById(slotDto.slotId);
        if(slot.isEmpty()){
            Slot newSlot= new Slot(slotDto.slotId, slotDto.vehicleType, slotDto.floor);
            SlotRepository.addSlot(newSlot);
            parkingLot.addSlot(newSlot.getSlotId());
        }
        else{
            throw new RuntimeException("Slot already exists");
        }
    }
    public boolean removeSlot(SlotDto slotDto){
        Optional<Slot> slot= SlotRepository.getSlotById(slotDto.slotId);
        if(slot.isEmpty()){
            throw new RuntimeException("Slot does not exist");
        }
        return parkingLot.removeSlot(slot.get().getSlotId());
    }

    public void addOperator(OperatorDto operatorDto){
        Optional<Operator> operator= OperatorRepository.getOperatorById(operatorDto.operatorId);
        if(operator.isPresent()){
            throw new RuntimeException("Operator already exists");
        }
        Operator newOperator= new Operator(operatorDto.operatorId, operatorDto.operatorName);
        OperatorRepository.addOperator(newOperator);
        parkingLot.addOperator(newOperator.getOperatorId());
    }

    public boolean removeOperator(OperatorDto operatorDto){
        Optional<Operator> operator= OperatorRepository.getOperatorById(operatorDto.operatorId);
        if(operator.isPresent()){
            throw new RuntimeException("Operator already exists");
        }

        boolean b = parkingLot.removeOperator(operator.get().getOperatorId());
        return b;
    }
    public boolean isSlotAvailable(SlotDto slotDto){
        Optional<Slot> slot= SlotRepository.getSlotById(slotDto.slotId);
        return slot.isEmpty();
    }
    public Optional<Slot> assignSlot(SlotDto slotDto){
        if(isSlotAvailable(slotDto)){
            throw new RuntimeException("Slot is not available");
        }
        parkingLot.occupySlot(slotDto.slotId);
        return SlotRepository.getSlotById(slotDto.slotId);
    }

    public boolean realseSlot(SlotDto slotDto){
        if(isSlotAvailable(slotDto)){
            throw new RuntimeException("Slot is not available");
        }
        return parkingLot.releaseSlot(slotDto.slotId);
    }



}
