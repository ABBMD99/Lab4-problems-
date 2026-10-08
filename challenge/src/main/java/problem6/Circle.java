package problem6;

public class Circle  extends Forme{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getSurface(){
        return Math.round(3.14 * radius * radius * 100.0) / 100.0;
    }
    public String toString() {
        return "Circle (radius " + radius + " cm)";
    }

}
