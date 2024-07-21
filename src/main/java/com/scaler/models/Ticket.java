package com.scaler.models;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private Date entryDate;
    private Operator operator;
    private User user;
    private Slot slot;

   private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.entryDate = builder.entryDate;
        this.operator = builder.operator;
        this.user = builder.user;
        this.slot = builder.slot;
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
    public static Builder createBuilder() {
       return new Builder();
    }
    public static class Builder {
        private String ticketId;
        private Date entryDate;
        private Operator operator;
        private User user;
        private Slot slot;

        public Builder ticketId(String ticketId) {
            this.ticketId= ticketId;
            return this;
        }
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
        public Ticket build() {
            return new Ticket(this);
        }
    }
}
