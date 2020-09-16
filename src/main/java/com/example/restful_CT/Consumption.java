package com.example.restful_CT;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CONSUMPTIONS")
public class Consumption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long consumptionId;
    private Date date;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    public Consumption(){

    }
    public Consumption(long consumptionId, Date date, int quantity){
        this.consumptionId = consumptionId;
        this.date = date;
        this.quantity = quantity;
    }

    public void setConsumptionId(long consumptionId) {
        this.consumptionId = consumptionId;
    }

    public long getConsumptionId() {
        return consumptionId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consumption)) return false;
        Consumption that = (Consumption) o;
        return consumptionId == that.consumptionId &&
                quantity == that.quantity &&
                date.equals(that.date) &&
                account.equals(that.account) &&
                food.equals(that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumptionId, date, quantity, account, food);
    }
}
