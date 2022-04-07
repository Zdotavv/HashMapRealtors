package com.company;

import java.util.Objects;

public class  Apartments {
    private final int rooms;
    private final String area;
    private final int floor;
    private final int square;
    private final double price;

    public Apartments(int rooms, String area, int floor, int square, double price) {
        this.rooms = rooms;
        this.area = area;
        this.floor = floor;
        this.square = square;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartments)) return false;
        Apartments that = (Apartments) o;
        return rooms == that.rooms && getFloor() == that.getFloor() && square == that.square && Double.compare(that.price, price) == 0 && Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, area, floor, square, price);
    }

    public int getFloor() {
        return floor;
    }

    public String toString() {
        return "[Кол-во комнат " + rooms + ", Район: " + area + ", Этаж: " + floor + ", Площадь " + square + ", Цена" + price + "]";
    }
}