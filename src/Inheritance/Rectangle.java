package Inheritance;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width = Math.max(width,0);
        this.length = Math.max(length,0);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return getLength()*getWidth();
    }
}

class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width,double length,double height){
        super(width,length);
        this.height = Math.max(0,height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
}
