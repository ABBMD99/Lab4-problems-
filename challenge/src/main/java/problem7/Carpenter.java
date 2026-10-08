package problem7;

public class Carpenter extends Person{


    public  Carpenter(String name){
        super(name);
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" the Carpenter");
    }

}
