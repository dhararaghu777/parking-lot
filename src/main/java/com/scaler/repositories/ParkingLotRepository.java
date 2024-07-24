package com.scaler.repositories;

import com.scaler.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    private static Map<String, ParkingLot> parkingLots = new HashMap<String, ParkingLot>();

    public static void addParkingLot(ParkingLot parkingLot) {
        parkingLots.putIfAbsent(parkingLot.getParkingLotId(), parkingLot);
    }

    public static Optional<ParkingLot> getParkingLotById(String parkingLotId) {
        return Optional.ofNullable(parkingLots.get(parkingLotId));
    }
}
