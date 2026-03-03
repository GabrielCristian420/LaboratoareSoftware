package ro.ulbs.proiectaresoftware.lab1;

public class Application {
    public static void main(String[] args) {

        String alfabet = "";
        for (char c = 'a'; c <= 'z'; c++) {
            alfabet += c;
        }

        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());

        String[] array = new String[5];
        int index = -1;

        for (int i = 0; i < alfabet.length(); i++) {
            char litera = alfabet.charAt(i);

            if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
                index++;
                array[index] = "" + litera;
            } else {
                array[index] += litera;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = \"" + array[i] + "\";");
        }
    }
}