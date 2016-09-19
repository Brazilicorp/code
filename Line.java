package lab3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author fauzianordlund
 */
public class Line extends Shape{
    private double x2;
    private double y2;
    public Line(double x, double y, Color color){
        super(x,y,color);
    }
    public Line(double x, double y, Color color,double x2,double y2){
        super(x,y,color);
        this.x2=x2;
        this.y2=y2;
    }
    public double getX2(){
        return x2;
    }
    public double getY2(){
        return y2;
    }
     public void setX2(){
        this.x2=x2;
    }
     public void setY2(){
        this.y2=y2;
    }
    @Override
    public void paint(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        String info
                = this.getClass().getName() + ": x=" + super.getX() + ", y=" + super.getY()
                +"x2= "+ x2+ "y2= " + y2 + ", color=" + super.getColor();
        return info;
    }
 
}
