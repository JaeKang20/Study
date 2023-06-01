package com.study.basicCodeTest;

public class Car {
    String carName;
    int capacity;
    int price;
    int hasNow;

    public Car(String carName, int capacity, int price, int hasNow){
        this.carName = carName;
        this.capacity = capacity;
        this.price = price;
        this.hasNow = hasNow;
    }
    @Override
    public String toString() {
        return "Car [carName=" + carName + ", capacity=" + capacity + ", price=" + price + ", hasNow=" + hasNow + "]";
    }
}
