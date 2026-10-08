package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject[] subjects = new Subject[20];
    private int subjectsNumber;


    public Instructor(){
        super("", "", "", "");
        this.employeeNumber="";

    }
    public Instructor(String lastName, String firstName, String phone,
                      String email, String employeeNumber) {
        super(firstName, lastName, phone, email);
        this.employeeNumber = employeeNumber;

    }

    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    public void setEmployeeNumber(String emNum){
        this.employeeNumber=emNum;
    }
    public String cleanEmployeeNumber(){
        if (employeeNumber == null) return "";
        String cleaned=employeeNumber.trim().replace(" ","");
        return cleaned;
    }

    public String summaryLine(){
        String s=String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",this.employeeNumber,this.getSecondName(),this.getFirstName());
        return s;
    }

    public String toCard(){
        StringBuilder sb=new StringBuilder();
        sb.append("Instructor\n").append("----------\n")
                .append("Employee #: ").append(this.employeeNumber).append("\n")
                .append("Name : ").append(this.getSecondName()).append(", ").append(this.getFirstName()).append("\n")
                .append("Email : ").append(this.getEmail()).append("\n")
                .append("Phone : ").append(this.getPhone()).append("\n");

        return sb.toString();

    }

    public String displayName(){
        StringBuilder sb=new StringBuilder();
        if(this.getSecondName()!=null && !this.getSecondName().isBlank()){
            sb.append(this.getSecondName().trim());
        }
        if(this.getFirstName()!=null && !this.getFirstName().isBlank()){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(this.getFirstName().trim());
        }

        if (sb.length() == 0) {
            sb.append("Unknown");
        }
        return sb.toString();
    }



}
