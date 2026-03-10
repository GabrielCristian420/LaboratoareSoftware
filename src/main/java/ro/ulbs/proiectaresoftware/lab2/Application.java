package ro.ulbs.proiectaresoftware.lab2;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();//d

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

        //a
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("xPlusY: "+ xPlusY);

        //b
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("zSet: "+ zSet);

        //c
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        Collections.sort(xMinusY);
        System.out.println("xMinusY: "+ xMinusY);

        //d
        for (Integer i : xPlusY) {
            if (i < p) {
                xPlusYLimitedByP.add(i);
            }
        }
        Collections.sort(xPlusYLimitedByP);
        System.out.println("xPlusYLimitedByP: "+ xPlusYLimitedByP);
    }
}
