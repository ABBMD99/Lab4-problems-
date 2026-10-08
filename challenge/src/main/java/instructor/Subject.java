package instructor;

import java.util.Locale;

public class Subject {
    private static int subjectsCount=1;
    private int id;
    private String code;
    private String title;
    private Instructor instructor ;

    public Subject(){
        this("","",null);
        this.instructor=null;

    }
    public Subject(String code,String title,Instructor instructor){
        this.id=subjectsCount++;
        this.code=code;
        this.title=title;
        this.instructor=instructor;
    }

    public String normalizedCode(){
        if(code == null) return "";
        return this.code.trim().toUpperCase();
    }
    public String properTitle(){
        if (title == null || title.isBlank()) return "";

        String[] words =this.title.trim().split("\\s+");
        for(int i = 0; i< words.length; i++){
            words[i]= words[i].substring(0,1).toUpperCase()+ words[i].substring(1).toLowerCase();
        }
        return String.join(" ",words);

    }

    public boolean isIntroCourse(){
        boolean titleMatch = title != null && title.toLowerCase().contains("intro");
        boolean codeMatch = code != null && normalizedCode().startsWith("INTRO-");
        return titleMatch || codeMatch;

    }
    public  String syllabusLine(Instructor instructor){
        StringBuilder sb=new StringBuilder();
        sb.append(this.code).append(" - ").append(this.title).append(" (Instructor: ");
        if(instructor!=null)
                sb.append(instructor.getSecondName()).append(" ").append(instructor.getFirstName());
        else sb.append("N/A");
        return sb.append(")").toString();
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
    //Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getSubjectsCount() {
        return subjectsCount;
    }

}
