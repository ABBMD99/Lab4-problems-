package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static final Major COMPUTER_SCIENCE = new Major("23", "computer science");
    //default constructor

    //public Major(){
        //this("23","computer science");
    //}

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
        this.students=new Student[50];
        this.studentCount=0;
    }

    // Method to add a student
    public boolean addStudent(Student s) {
        if(studentCount>=50){
            System.out.println("This major is full!");
            return false;
        }
        students[studentCount]=s;
        studentCount++;
        return true;

    }

    public Student findStudentByCNE(String cne) {
        if (cne == null)
            return null;
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            if (s.getCne()!=null && (s.getCne().trim()).equals(cne.trim())){
                return s;
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        Student s=findStudentByCNE(cne);
        if(s==null) return false;

        for(int i=0;i<studentCount;i++){
            if(students[i]==s){
                for(int j=i;j<studentCount-1;j++){
                    students[j]=students[j+1];
                }
                students[studentCount -1]=null;
                studentCount--;
                if (s.getMajor() == this) s.setMajor(null);
                return true;
            }
        }
        return false;

    }

    public void getOccupancyRate() {
        double rate = (double) studentCount / 50 * 100;
        System.out.println(name + " capacity: 50 students");
        System.out.println("Current enrollment: " + studentCount + " students");
        System.out.println(String.format("Occupancy rate = %.1f%%", rate));
    }

    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<studentCount;i++){
            Student s=students[i];
            sb.append(i+1).append(". ").append(s.getCne()).append(" ").append(s.getFullNameFormatted());
            if(i<studentCount-1) sb.append("\n");
        }

        return sb.toString();
    }

    // Getters


    public int getId() {
        return id;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public String toString() {
        return "Major [id=" + id + ", code=" + code + ", name=" + name + "]";
    }

    public int getStudentCount() {
        return studentCount;
    }

    //Setters

    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }

    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            System.out.println((i + 1) + ". " + s.getCne() + " " + s.getSecondName() + " " + s.getFirstName());
        }


    }


}
