public class Circle extends FillableShape{
    private double diameter;
    public Circle(double x, double y, Color color, boolean filled) {
        super(x, y, color, filled);
    }
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter){
        this.diameter=diameter;
    }
     public void paint(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
     public String toString(){
         return "x= " + super.getX() +" y = " + super.getY() + "\ncolor " + super.getColor() + "filled = "+ super.isFilled();
     }
}