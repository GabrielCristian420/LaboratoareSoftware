package ro.ulbs.proiectaresoftware.lab5.advanced;

public abstract class ACalculator {
    Object state;
    public Object result(){
        return state;
    }
    public Object clear(){
        return init();
    }
    public abstract Object init();
}
