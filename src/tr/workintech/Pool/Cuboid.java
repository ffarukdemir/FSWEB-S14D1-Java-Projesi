package tr.workintech.Pool;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        if(height<0){
            return height=0;
        }
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }
}
