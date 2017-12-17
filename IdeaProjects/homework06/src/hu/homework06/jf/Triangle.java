package hu.homework06.jf;

public class Triangle extends AbstractShape {

    private float a;
    private float b;
    private float c;
    private float beta;

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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    @Override
    public float getArea() {
        return (float) (a*c*Math.sin(beta)/2);
          }

    @Override
    public float getPerimeter() {
        return a+b+c;
    }

    public String toString(){
     return "Triangle";

    }
}
