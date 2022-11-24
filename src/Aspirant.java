public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, int group, boolean isLeader, double averageMark, int number, String scientificWork) {
        super(firstName, lastName, group, isLeader, averageMark, number);
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() == 5.0){
            System.out.println(getName()+ " ваша стипендия = 2000 сом");

        }else System.out.println(getName()+ " ваша стипендия = 1800 сом");
    }

    @Override
    public String toString() {
        System.out.print("aspirant ");
        return super.toString();
    }
}
