public class Group {

    Student[] students = new Student[10];
    Student student;
private int groupNumber;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void addStudent(Student students){
        this.students[students.getNumber()] = students;
    }

    private int numberOfGroup;
    public void listOfStudents(){
        Student[] students = this.students;
        System.out.println("Список студентов:");
        for (Student stud: students) {
            System.out.println(stud);
        }}


    public void searchStudent(String studentName){
        Student[] students= this.students;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!= null){
                if (students[i].getName().equals(studentName)) {
                    System.out.println("Такой студент сидит в группе: ");
                    System.out.println("Имя " + students[i].getName());
                }}
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }
//    public void getLeader(){
//        Student[] students = this.students;
//
//        for (Student stud : students) {
//        if(student.isLeader() == true){
//            System.out.println("староста группы" + stud.getName());
//
//             }
//        }
//    }
    public static void getLeader (Student[] students) {

        for (Student stud : students) {
            if (stud.isLeader() == true) {
                System.out.println("староста группы" + stud.getName());
            }
        }

    }}
