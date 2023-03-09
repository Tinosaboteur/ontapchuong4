package code;


public class square extends rectangle{
    protected double side;
    public square(){}
    public square(double side){
        this.side = side;
    }
    public square(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLenght(double side){
        this.length = side;
    }
    public String toString(){
        return "side la: "+this.side;
    }
    
}
