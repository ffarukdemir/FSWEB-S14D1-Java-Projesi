package tr.workintech.DevComp;

public class MidDeveloper extends Employee{

    public MidDeveloper(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        setSalary(3000);

        System.out.println("Mid dev. starts to working");
    }
}
