package problem7;

public abstract  class Person {
    private String name;


    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.print("I am "+name);
    }
}
