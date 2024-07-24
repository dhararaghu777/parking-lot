package com.scaler.models;

import java.util.Date;
import java.util.UUID;

public class Bill {
    private String billId;
    private Date exitDate;
    private Ticket  ticket;
    private Operator operator;
    private final IPayment payment;

    private Bill(Builder builder) {
        this.billId = UUID.randomUUID().toString();
        this.exitDate = builder.exitDate;
        this.ticket = builder.ticket;
        this.operator = builder.operator;
        this.payment = builder.payment;
    }

    public String getBillId() {
        return billId;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public IPayment getPayment() {
        return payment;
    }
    public static Builder createBuilder(){
        return new Builder();
    }
    public static class Builder {
        private String billId;
        private Date exitDate;
        private Ticket  ticket;
        private Operator operator;
        private IPayment payment;
        public Builder() {}

        public Builder exitDate(Date exitDate) {
            this.exitDate = exitDate;
            return this;
        }
        public Builder ticket(Ticket ticket) {
            this.ticket = ticket;
            return this;
        }
        public Builder operator(Operator operator){
            this.operator = operator;
            return this;
        }

        public Builder payment(IPayment payment) {
            this.payment= payment;
            return this;
        }
        public Bill build() {
            return new Bill(this);
        }
    }
}
