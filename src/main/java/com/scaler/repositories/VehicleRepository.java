package com.scaler.repositories;

import com.scaler.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private static Map<String, Vehicle> vehicles = new HashMap<String, Vehicle>();

    public static void addVehicle(Vehicle vehicle) {
        vehicles.putIfAbsent(vehicle.getVehicleNo(), vehicle);
    }
    public static Optional<Vehicle> getVehicleById(String vehicalNo){
        return Optional.ofNullable(vehicles.get(vehicalNo));
    }

}
