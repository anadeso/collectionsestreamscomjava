package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        // Para usar uma Lista a primeira coisa é instancia-la

        List<String>  nomes = new ArrayList<>();

        // Vamos add nomes em nossa Lista que criamos, que é a nomes
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        // Metodo set realiza alteracao, no qual esse metodo espera um int e o elemento
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        // Podemos ordenar de forma alfabetica, chamando o metodo sort passando a nossa lista
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2, "Carol");
        System.out.println(nomes);


    }
}
