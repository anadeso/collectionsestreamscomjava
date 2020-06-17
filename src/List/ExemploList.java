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

        // Metodo remove - posicao da lista
        //nomes.remove(4);
        //System.out.println(nomes);

        // Metodo remove - objeto da lista
        //nomes.remove("Carol");
        //System.out.println(nomes);

        // Metodo get, retorna o elemento dado no qual passamos para variavel
        String nome = nomes.get(1);
        System.out.println(nome);

        // Para sabermos o tamanho da nossa lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Retorna um boolean, verifica se um elemento existe na lista
        boolean temAna = nomes.contains("Ana");
        System.out.println(temAna);
        boolean temJoao = nomes.contains("Flavia");
        System.out.println(temJoao);

        // Verificar se a lista esta vazia
        boolean listaEstaVazi = nomes.isEmpty();
        System.out.println(listaEstaVazi);

        // Limpa nossa lista
        //nomes.clear();

        // IndexOf retorna qual é a posicao do elemento da lista, caso nao exista retorna -1
        int posicaoLarissa = nomes.indexOf("Larissa");
        System.out.println(posicaoLarissa);

    }
}
