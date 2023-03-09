package code;

import java.util.function.ObjDoubleConsumer;

public class rectangle extends shape{
    protected double width = 1,length = 1;

    public rectangle(){}
    public rectangle(String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this. width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLenght(){
        return this.length;
    }
    public void setLenght(double length){
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*this.width*2;
    }
    public String toString(){
        return this.getArea() +","+ this.getPerimeter();
    }
}
