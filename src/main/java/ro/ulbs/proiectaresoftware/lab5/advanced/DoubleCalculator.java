package ro.ulbs.proiectaresoftware.lab5.advanced;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double x) {
        this.state = x;
    }
    public DoubleCalculator add(Double a) {
        this.state = (Double) this.state + a;
        return this;
    }
    public DoubleCalculator substract(Double a) {
        this.state = (Double) this.state - a;
        return this;
    }
    public DoubleCalculator multiply(Double a) {
        this.state = (Double) this.state * a;
        return this;
    }

    @Override
    public Object init() {
        return 0.0;
    }
}
