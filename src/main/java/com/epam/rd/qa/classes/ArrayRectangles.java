package com.epam.rd.qa.classes;

public class ArrayRectangles {
    private final Rectangle[] rectangleArray;

    public ArrayRectangles(int size) throws IllegalArgumentException{
        if (size<=0) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = new Rectangle[size];
    }

    public ArrayRectangles(Rectangle... rectangles) throws IllegalArgumentException{
        if (rectangles==null||rectangles.length==0) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i]==null) {
                rectangleArray[i]=rectangle;
                return true;
            }
        }
        return false;

    }

    public int size() {
        int amount=0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle != null) amount++;
        }
        return amount;
    }

    public int indexMaxArea() {
        int indexMax=0;
        for (int i = 0; i < size(); i++) {
            if (rectangleArray[indexMax].area()<rectangleArray[i].area()) indexMax=i;

        }
        return indexMax;
    }

    public int indexMinPerimeter() {
        int indexMin=0;
        for (int i = 0; i < size(); i++) {
            if (rectangleArray[indexMin].perimeter() > rectangleArray[i].perimeter()) indexMin = i;
        }
        return indexMin;
    }

    public int numberSquares() {
        int square=0;
        for (int i = 0; i < size(); i++) {
            if (rectangleArray[i].isSquare()) square++;
        }
        return square;
    }
}
