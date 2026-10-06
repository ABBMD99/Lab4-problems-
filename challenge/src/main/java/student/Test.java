package student;

public class Test {
    public static void main(String[] args) {
        Major cs=Major.COMPUTER_SCIENCE;

        Major math=new Major("15","Math");
        Major physics = new Major("17", "Physics");

        Student s1=new Student("SAFI","Amal","08888888","amal@amal","22885676",cs);
        Student s2 =new Student("ALAMI", "Samir", "07777777", "samir@mail.com", "23585976");

        new Student("BENANI", "Sara", "06666666", "sara@mail.com", "21111111", math);
        new Student("IDRISSI", "Omar", "06555555", "omar@mail.com", "22222222", physics);

        // Display computer science students
        System.out.println("The list of students in the computer science major is:");
        cs.displayStudents();
        //physics.displayStudents();
        System.out.println("The list of students in the physics major is:");
        physics.displayStudents();
        //getOccupancyRate
        cs.getOccupancyRate();
        //findStudentByCNE(String)
        System.out.println("\nSearch by CNE:");
        Student found=cs.findStudentByCNE("22885676");
        System.out.println(found!=null?found.getFullNameFormatted():"Not found!");
        Student missing = cs.findStudentByCNE("00000000");
        System.out.println(missing!=null?missing.getFullNameFormatted():"Not found");

        // getStudentCount()
        System.out.println("\nNumber of CS students: " + cs.getStudentCount());
        System.out.println("Number of Math students: " + math.getStudentCount());

        // getStudentListAsString()
        System.out.println("\nStudent list as string (CS):");
        System.out.println(cs.getStudentListAsString());

        //removeStudetnt

        System.out.println("\nRemove CNE 22885676: " + cs.removeStudent("22885676"));
        System.out.println("Remove CNE 22885676 again: " + cs.removeStudent("22885676"));
        System.out.println("Number of CS students: " + cs.getStudentCount());
        System.out.println(cs.getStudentListAsString());














    }
}

