package ro.ulbs.proiectaresoftware.lab5;

public class AdvancedCalculator extends IntCalculator{
    AdvancedCalculator(int x) {
        super(x);
    }

    public AdvancedCalculator impartire(int x) {
        this.state = this.state / x;
        return this;
    }
    public AdvancedCalculator sqroot(int x) {
        this.state = (int) Math.sqrt(this.state);
        return this;
    }
    public AdvancedCalculator radical(int x){
        this.state = (int) Math.pow(this.state, 1/x);
        return this;
    }
}
