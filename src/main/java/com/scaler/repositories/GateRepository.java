package com.scaler.repositories;

import com.scaler.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private static Map<Integer, Gate> gates = new HashMap<>();

    public static void addGate(Gate gate) {
        gates.putIfAbsent(gate.getGateNo(), gate);
    }

    public static Optional<Gate> getVehicleById(int gateId){
        return Optional.ofNullable(gates.get(gateId));
    }
}
