package org.example.example_05_02;

//В main создать массив содержащий эти фигуры.
// В цикле у каждой фигуры вызвать метод draw ,
// который будет выводить в консоль сообщение в формате «Draw
// <форма фигуры> of <цвет> color with a <соответствующий параметр>».
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 6);
        Triangle triangle = new Triangle("green", 12);
        Square square = new Square("yellow", 8);
        Shape[] shapes = {circle, triangle, square};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

