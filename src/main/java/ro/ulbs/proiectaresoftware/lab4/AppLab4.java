package ro.ulbs.proiectaresoftware.lab4;

import java.util.*;

public class AppLab4 {
    static void main() {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        //a
        System.out.println("Varste: "+varste);
        varste.put("Vlad",19);
        varste.put("Iulia",19);

        //c
        HashMap<String, Tanar> tineri=new HashMap<>();
        for(String nume: varste.keySet()){
            int age=varste.get(nume);
            String address=adrese.get(nume);
            tineri.put(nume, new Tanar(nume, age, address));
        }
        System.out.println("------------------------------");
        for(String nume: tineri.keySet()) {
            System.out.println(tineri.get(nume));
        }
    }
}
