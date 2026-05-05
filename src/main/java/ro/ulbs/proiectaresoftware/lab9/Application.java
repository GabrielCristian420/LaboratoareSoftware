package ro.ulbs.proiectaresoftware.lab9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Application {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numbers = IntStream.range(0, 100).map(i->5+rand.nextInt(21)).boxed().collect(Collectors.toList());
        Random random = new Random();
        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numere);
        //1 a
        int suma=numere.stream().reduce(0, (a,b)->a+b);
        System.out.println(suma);
        //1 b
        int max=numere.stream().max((a,b)->a>b?1:-1).get();
        int min=numere.stream().min((a,b)->a>b?1:-1).get();
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        //1 c
        List<Integer> numere2=numere.stream().filter(n->n>=10 && n<=20).collect(Collectors.toList());
        System.out.println(numere2);
        //1 d
        List<Double> numereDouble=numere.stream().mapToDouble(n->n*1.0).boxed().collect(Collectors.toList());
        System.out.println(numereDouble);
        //1 e
        boolean areNumere=numere.stream().anyMatch(n->n==12);
        System.out.println(areNumere);
        //2 a
        String text="Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte=List.of(text.split(" "));
        List<String> cuvintePeste5=cuvinte.stream().filter(c->c.length()>=5).collect(Collectors.toList());
        System.out.println(cuvintePeste5);
        //2 b
        List<String> ordonate=cuvintePeste5.stream().sorted().collect(Collectors.toList());
        System.out.println(ordonate);
        //2 c
        String cuvP=cuvinte.stream().filter(c->c.startsWith("p")).findFirst().get();
        System.out.println(cuvP);
    }
}
