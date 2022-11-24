public class Student {
    private String Name;
    private String lastName;
   private int group;
   private double averageMark;
private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(String firstName, String lastName, int group, boolean isLeader, double averageMark, int number) {
        this.Name = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isLeader = isLeader;
        this.averageMark = averageMark;
        this.number = number;
    }

    private  boolean isLeader;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void getScholarship(){
        if (averageMark == 5.0){
            System.out.println(Name + " ваша стипендия = 1000 сом");
        }else System.out.println(Name + " ваша стипендия = 800 сом");
    }




    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + Name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                ", isLeader=" + isLeader +
                '}';
    }
}
