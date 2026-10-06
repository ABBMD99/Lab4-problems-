package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        super("","","","");

    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
        if (major != null)
            major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,Major.COMPUTER_SCIENCE);

    }

    public String getFullNameFormatted(){
        String last = this.getSecondName().toUpperCase();
        String first = this.getFirstName();
        if (!first.isEmpty())
            first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        return String.format("%s, %s", last, first);

    }


    // Getters
    public String getCne(){
        return this.cne;
    }
    public Major getMajor(){
        return this.major;
    }

    // Setters
    public void setCne(String cne){
        this.cne=cne;
    }
    public void setMajor(Major M){
        if(this.major==M) return;

        Major old=this.major;
        this.major=M;
        if(old !=null)
            old.removeStudent(this.cne);
        if(M!=null)
            M.addStudent(this);
    }

    public String toString(){
        return "Student [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName
                + ", phone=" + phone + ", email=" + email + ", cne=" + cne + ", Major=" + major
                 + "]";
    }

}

