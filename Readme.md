# Classes

The purpose of this exercise is to introduce you to inheritance in Java.

Estimated time - 40 minutes.

## Description

Task #5 [Classes]

Develop [Rectangle](src/main/java/com/epam/rd/qa/classes/Rectangle.java) and [ArrayRectangles](src/main/java/com/epam/rd/qa/classes/ArrayRectangles.java) classes with a predefined functionality.
 
### On a Common level it is obligatory:

To develop `Rectangle` class with following content:
- 2 closed real fields `sideA` and `sideB` (sides А and В of the rectangle). 
- Constructor with two real parameters `a` and `b` (parameters specify rectangle sides). 
- Constructor with a real parameter a (parameter specify side А of a rectangle, side B is equal to A).
- Constructor without parameters (side А of a rectangle equals to 4, side В - 3). 
- Method `getSideA`, returning value of the side А.
- Method `getSideВ`, returning value of the side В.
- Method `area`, calculating and returning the area value.
- Method `perimeter`, calculating and returning the perimeter value.
- Method `isSquare`, checking whether current rectangle is shape square or not. Returns `true` if the shape is square and `false` in another case.
- Method `replaceSides`, swapping rectangle sides. 
- Override methods `equals` and `hashCode`.

> It's recommended to implement `toString` method, but it is not tested.

### On an Advanced level also needed:

Complete Level Low Assignment

Develop class `ArrayRectangles`, in which declare:

- Private field `rectangleArray` - array of rectangles
- Constructor creating an empty array of rectangles with given length. It should throw `IllegalArgumentException`, if length is negative or equals to zero. 
- Constructor that receives an arbitrary amount of objects of type `Rectangle`
  or an array of objects of type `Rectangle`. 
  It should throw `IllegalArgumentException`, 
  if array is `null` or length of array is equal to zero.
  > It's guaranteed that array does not contain null values. 
- Method `addRectangle` that adds a rectangle of type `Rectangle` to the array on the nearest free place and returning `true`, or returning `false`, if there is no free space in the array.
- Method `size` that returns actual amount of elements in array. If `addRectangle` returns `true` this method should return new amount of elements. 
- Method `numberMaxArea` that returns order number (index) of the first rectangle with the maximum area value in array (numeration starts from zero).
- Method `numberMinPerimeter` that returns order number(index) of the first rectangle with the minimum perimeter value in array (numeration starts from zero).
- Method `numberSquares` that returns the number of squares in the array of rectangles 

