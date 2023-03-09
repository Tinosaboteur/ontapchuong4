package code;

public class circle extends shape{
    protected double radius = 1;

    public circle(){}
    public circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 3.14*2*this.radius;
    }
    public String toString(){
        return this.getArea()+","+this.getPerimeter();
    }
}
