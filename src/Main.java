import tr.workintech.DevComp.HRManager;
import tr.workintech.DevComp.JuniorDeveloper;
import tr.workintech.DevComp.MidDeveloper;
import tr.workintech.DevComp.SeniorDeveloper;
import tr.workintech.Pool.Cuboid;
import tr.workintech.Pool.Rectangle;
import tr.workintech.cylinder.Circle;
import tr.workintech.cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/*
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getAreaa());

        Cylinder cylinder = new Cylinder(5.55, -7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getAreaa());

        System.out.println("cylinder.volume= " + cylinder.getVolume());


        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(10,5,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
   */

        HRManager hrManager= new HRManager("ahmet yılmaz", 007, 3500);

        JuniorDeveloper mehmetYilmaz= new JuniorDeveloper("mehmet yılmaz", 152, 2750);

        MidDeveloper fatihYildiz =new MidDeveloper("fatih yıldız", 100, 3500);

        SeniorDeveloper aliAk= new SeniorDeveloper("ali ak", 70, 5000);

        JuniorDeveloper veli =new JuniorDeveloper("Veli ", 155, 2500);
        MidDeveloper Mustafa = new MidDeveloper("mustafa", 74, 3600);
        SeniorDeveloper Kemal= new SeniorDeveloper("Kemal", 24, 4750);

        JuniorDeveloper Murat =new JuniorDeveloper("Murat ", 156, 2500);

        JuniorDeveloper Fatih =new JuniorDeveloper("Fatih ", 1455, 2500);
        JuniorDeveloper yakup =new JuniorDeveloper("yakup ", 15, 2500);



        hrManager.work();
        hrManager.addEmployee(mehmetYilmaz);
        hrManager.addEmployee(fatihYildiz);
        hrManager.addEmployee(aliAk);

        hrManager.addEmployee(veli);
        hrManager.addEmployee(Mustafa);
        hrManager.addEmployee(Kemal);
        hrManager.addEmployee(Murat);



        System.out.println( hrManager);


    }
}