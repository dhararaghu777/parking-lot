package com.scaler.repositories;

import com.scaler.models.Slot;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SlotRepository {
    private static Set<Integer> slotSet= new HashSet<Integer>();
    private static final ConcurrentHashMap<Integer, Slot> availableSlots = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, Slot> assignedSlots = new ConcurrentHashMap<>();

    public static Optional<Slot> getSlotById(int slotId) {
        Slot slot = availableSlots.remove(slotId);
        assignSlot(slot);
        return Optional.ofNullable(slot);
    }

    public static void addSlot(Slot slot) {
      if (assignedSlots.containsKey(slot.getSlotId())) {
            Slot assignedSlot = assignedSlots.remove(slot.getSlotId());
            availableSlots.putIfAbsent(slot.getSlotId(), assignedSlot);
        } else {
            availableSlots.putIfAbsent(slot.getSlotId(), slot);
        }
    }

    private static void assignSlot(Slot slot) {
        assignedSlots.putIfAbsent(slot.getSlotId(), slot);
    }

    public static int getAvailableSlotsCount() {
        return availableSlots.size();
    }

    public static int getAssignedSlotsCount() {
        return assignedSlots.size();
    }
    public static boolean checkSlot(Integer slotId){
        return slotSet.contains(slotId);
    }
}

