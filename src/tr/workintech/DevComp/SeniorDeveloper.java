package tr.workintech.DevComp;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
setSalary(4000);
        System.out.println("Senior Dev. starts to working");
    }
}
