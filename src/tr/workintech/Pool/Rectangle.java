package tr.workintech.Pool;

public class Rectangle {
    private double length;

    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        if(length<0){
            length=0;
        }
        return length;
    }

    public double getWidth() {
        if(length<0){
            length=0;
        }
        return width;
    }

    public double getArea() {
        return width*length;
    }

}
