package tr.workintech.DevComp;

import java.util.Arrays;

public class HRManager extends Employee{

    JuniorDeveloper[] juniorDevelopers= new JuniorDeveloper[3];
    MidDeveloper[] midDevelopers= new MidDeveloper[3];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[3];


    public HRManager(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {

        System.out.println("HRmanager starts to working");
    }

    public void  addEmployee(JuniorDeveloper juniorDeveloper){
        for (int i=0; i<juniorDevelopers.length; i++ ){
            if (juniorDevelopers[i]==null){
                juniorDevelopers[i]= juniorDeveloper;
                break;
            } else if(i==juniorDevelopers.length-1){
                System.out.println("Junior Developer dolu");
            }
        }

    }
    public void  addEmployee(MidDeveloper midDeveloper){
        for (int i=0; i<midDevelopers.length; i++ ){
            if (midDevelopers[i]==null){
                midDevelopers[i]= midDeveloper;
                break;
            } else if(i==midDevelopers.length-1){
                System.out.println("Mid Developer dolu");
            }
        }

    }
    public void  addEmployee(SeniorDeveloper seniorDeveloper){
        for (int i=0; i<seniorDevelopers.length; i++ ){
            if (seniorDevelopers[i]==null){
                seniorDevelopers[i]= seniorDeveloper;
                break;
            } else if(i==seniorDevelopers.length-1){
                System.out.println("Mid Developer dolu");
            }
        }

    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
