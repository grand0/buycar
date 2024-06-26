package ru.kpfu.itis.gr201.ponomarev.cars.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Advertisement {
    private int id;
    private int carId;
    private String description;
    private int price;
    private int sellerId;
    private Timestamp publicationTs;
    private int mileage;
    private String carColor;
    private Condition condition;
    private int owners;
    private boolean exchangeAllowed;
    private int viewCount;

    public Advertisement(int carId, String description, int price, int sellerId, Timestamp publicationTs, int mileage, String carColor, Condition condition, int owners, boolean exchangeAllowed, int viewCount) {
        this.carId = carId;
        this.description = description;
        this.price = price;
        this.sellerId = sellerId;
        this.publicationTs = publicationTs;
        this.mileage = mileage;
        this.carColor = carColor;
        this.condition = condition;
        this.owners = owners;
        this.exchangeAllowed = exchangeAllowed;
        this.viewCount = viewCount;
    }

    public Advertisement(int id, int carId, String description, int price, int sellerId, Timestamp publicationTs, int mileage, String carColor, Condition condition, int owners, boolean exchangeAllowed, int viewCount) {
        this.id = id;
        this.carId = carId;
        this.description = description;
        this.price = price;
        this.sellerId = sellerId;
        this.publicationTs = publicationTs;
        this.mileage = mileage;
        this.carColor = carColor;
        this.condition = condition;
        this.owners = owners;
        this.exchangeAllowed = exchangeAllowed;
        this.viewCount = viewCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public Timestamp getPublicationTs() {
        return publicationTs;
    }

    public void setPublicationTs(Timestamp publicationTs) {
        this.publicationTs = publicationTs;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getOwners() {
        return owners;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    public boolean isExchangeAllowed() {
        return exchangeAllowed;
    }

    public void setExchangeAllowed(boolean exchangeAllowed) {
        this.exchangeAllowed = exchangeAllowed;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return getId() == that.getId() && getCarId() == that.getCarId() && getPrice() == that.getPrice() && getSellerId() == that.getSellerId() && getMileage() == that.getMileage() && getOwners() == that.getOwners() && isExchangeAllowed() == that.isExchangeAllowed() && getViewCount() == that.getViewCount() && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getPublicationTs(), that.getPublicationTs()) && Objects.equals(getCarColor(), that.getCarColor()) && getCondition() == that.getCondition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarId(), getDescription(), getPrice(), getSellerId(), getPublicationTs(), getMileage(), getCarColor(), getCondition(), getOwners(), isExchangeAllowed(), getViewCount());
    }
}
