package com.scaler.repositories;

import com.scaler.models.User;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository{
    private static final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    public static Optional<User> getUserById(String userId){
        return Optional.ofNullable(users.get(userId));
    }

    public static void addUser(User user){
        users.putIfAbsent(user.getId(), user);
    }
}
