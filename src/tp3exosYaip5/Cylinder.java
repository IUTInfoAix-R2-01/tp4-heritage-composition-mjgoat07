package tp3exosYaip5;

public class Cylinder {
    private Circle base;  
    private double height;
    
    public Cylinder() {
        base = new Circle();  
        height = 1.0;
    }
    
    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }
    
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getRadius() {
        return base.getRadius();
    }
    
    public String getColor() {
        return base.getColor();
    }
    
    public Circle getBase() {
        return base;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    
    public void setColor(String color) {
        base.setColor(color);
    }
    
    public double getBaseArea() {
        return base.getArea();
    }
    
    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }
    
    public double getVolume() {
        return base.getArea() * height;
    }
    
    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}