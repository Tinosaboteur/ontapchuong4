package code;

public class shape {
    protected String color = "red";
    protected boolean filled = true;

    protected shape(){}

    protected shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getcolor(){
        return this.color;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = true;
    }
    public String toString(){
        return this.color+","+this.filled;
    }
}
