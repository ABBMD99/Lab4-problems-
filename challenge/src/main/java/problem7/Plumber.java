package problem7;

public class Plumber extends Person{

    public  Plumber(String name){
        super(name);
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" the Plumber.");
    }
}
