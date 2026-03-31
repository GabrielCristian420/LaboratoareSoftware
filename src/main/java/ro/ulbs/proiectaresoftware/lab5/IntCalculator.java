package ro.ulbs.proiectaresoftware.lab5;

public class IntCalculator {
    public int state;
    IntCalculator(int x) {
        this.state = x;
    }
    public IntCalculator add(int a) {
        this.state +=a;
        return this;
    }
    public IntCalculator subtract(int a) {
        this.state -=a;
        return this;
    }
    public IntCalculator multiply(int a) {
        this.state *=a;
        return this;
    }
    public int result() {
        return this.state;
    }
    public void reset() {
        this.state = 0;
    }
}
