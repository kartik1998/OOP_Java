package Inheritance;

public class Circle {
    private double radius;
    Circle(double radius){
        this.radius = Math.max(radius,0);
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
class Cylinder extends Circle{
    private double height;

    Cylinder(double radius,double height) {
        super(radius);
        this.height = Math.max(height,0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*getHeight();
    }
}
