public class Main {
    public static void main(String[] args) {
        Student student =  new Student("Nurma", "temirbekov",1, true, 5,1);
        Student student2 =  new Student("Alya", "Nadyrbekova",1, false, 4,2);

        Aspirant aspirant = new Aspirant("mike", "joe", 2, false, 4, 3, "physic exam");

        Group group1 = new Group(1);
        Group group2 = new Group(2);

        group1.addStudent(student);
        group1.addStudent(student2);
        group1.listOfStudents();
        group2.addStudent(aspirant);

        student.getScholarship();

        aspirant.getScholarship();


        group1.searchStudent("Alya");
        group1.getLeader(group1.students);

    }
}
