package hu.homework06.jf;

public class Rectangle extends AbstractShape {

    private float a;
    private float b;


    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public float getArea() {
        return a*b;
    }

    @Override
    public float getPerimeter() {
        return 2*(a+b);
    }

    public String toString() {
        return "Rectangle";
    }
}
