package com.scaler.controllers;

import com.scaler.dtos.OperatorDto;
import com.scaler.dtos.SlotDto;
import com.scaler.models.ParkingLot;
import com.scaler.models.Slot;
import com.scaler.models.SlotType;
import com.scaler.models.VehicleType;
import com.scaler.repositories.SlotRepository;
import com.scaler.services.ParkingLotService;

public class ParkingLotController  {

    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public String addSlots(SlotDto slotDto){
       parkingLotService.addSlot(slotDto);
       return "Slot added successfully";
    }
    public String removeSlots(SlotDto slotDto){
        parkingLotService.removeSlot(slotDto);
        return "Slot removed successfully";
    }
    public String addOperator(OperatorDto operatorDto){
        parkingLotService.addOperator(operatorDto);
        return "Operator added successfully";
    }
    public String removeOperator(OperatorDto operatorDto){
        parkingLotService.removeOperator(operatorDto);
        return "Operator removed successfully";
    }



}
