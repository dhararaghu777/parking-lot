package com.scaler.models;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String ticketId;
    private Date entryDate;
    private Operator operator;
    private User user;
    private Slot slot;
    private Vehicle vehicle;

   private Ticket(Builder builder) {
        this.ticketId= UUID.randomUUID().toString();
        this.entryDate = builder.entryDate;
        this.operator = builder.operator;
        this.user = builder.user;
        this.slot = builder.slot;
        this.vehicle= builder.vehicle;
   }

    public String getTicketId() {
        return ticketId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public Operator getOperator() {
        return operator;
    }

    public User getUser() {
        return user;
    }

    public Slot getSlot() {
        return slot;
    }
    public Vehicle getVehicle() {return vehicle}
    public static Builder createBuilder() {
       return new Builder();
    }
    public static class Builder {

        private Date entryDate;
        private Operator operator;
        private User user;
        private Slot slot;
        private Vehicle vehicle;

        public Builder entryDate(Date entryDate) {
            this.entryDate = entryDate;
            return this;
        }
        public Builder operator(Operator operator) {
            this.operator = operator;
            return this;
        }
        public Builder user(User user) {
            this.user = user;
            return this;
        }
        public Builder slot(Slot slot){
            this.slot = slot;
            return this;
        }
        public Builder vehicle(Vehicle vehicle){
            this.vehicle = vehicle;
            return this;
        }
        public Ticket build() {
            return new Ticket(this);
        }
    }
}
