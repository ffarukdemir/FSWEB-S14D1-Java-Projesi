package tr.workintech.cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        if(radius<0){
            radius=0;
        }
        return radius;
    }

    public double getAreaa(){
        return radius*radius*Math.PI;
    }
}
