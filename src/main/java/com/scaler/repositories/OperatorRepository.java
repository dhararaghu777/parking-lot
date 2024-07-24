package com.scaler.repositories;

import com.scaler.models.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorRepository {
    public static Map<String, Operator> operators= new HashMap<>();

    public static void addOperator(Operator operator) {
        operators.putIfAbsent(operator.getOperatorId(), operator);
    }

    public static Optional<Operator> getOperatorById(String operatorId) {
        return Optional.ofNullable(operators.get(operatorId));
    }
}
