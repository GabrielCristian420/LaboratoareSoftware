package ro.ulbs.proiectaresoftware.lab5.advanced;

public class NewIntCalculator extends ACalculator {
    @Override
    public Object init() {
        return 0.0;
    }
    public NewIntCalculator(Integer x) {
        this.state = x;
    }
    public NewIntCalculator add(Integer a) {
        this.state = (Integer) this.state + a;
        return this;
    }
    public NewIntCalculator substract(Integer a) {
        this.state = (Integer) this.state - a;
        return this;
    }
    public NewIntCalculator multiply(Integer a) {
        this.state = (Integer) this.state * a;
        return this;
    }
}
