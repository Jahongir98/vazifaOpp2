public class RightTriangle {
    private double a;
    private double b;
    //yuza
    public double getArea() {
        return (a * b) / 2;
    }
    //parametr
    public double getPerimeter() {
        double gipotenuza = Math.sqrt(a * a + b * b);
        return a + b + gipotenuza;
    }
    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public RightTriangle() {
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getH() {
        return b;
    }
    public void setH(double b) {
        this.b = b;
    }
}
