package com.epam.rd.qa.classes;

import java.util.Objects;

public class Rectangle {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) throws IllegalArgumentException{
        if (sideA<=0||sideB<=0) {
            throw new IllegalArgumentException();
        }
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) throws IllegalArgumentException{
        if (sideA<=0) {
            throw new IllegalArgumentException();
        }
        this.sideA = sideA;
        this.sideB = sideA;
    }

    public Rectangle() {
        this.sideA = 4.0;
        this.sideB = 3.0;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA*sideB;
    }

    public double perimeter() {
        return (sideA+sideB)*2;
    }

    public boolean isSquare() {
        return sideA==sideB;
    }

    public void replaceSides () {
        double rep;
        rep =sideA;
        sideA=sideB;
        sideB=rep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getSideA(), getSideA()) == 0 && Double.compare(rectangle.getSideB(), getSideB()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
