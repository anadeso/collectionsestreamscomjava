package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        // Adicinando elementos
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // poll: retorna e remove o primeiro elemento da fila, e retorna null se a fila estiver vazia
        // peck: retorna mas nao remove o primeiro elemento, e retorna null se a fila estiver vazia
        // element: retorna e nao remove o primeiro elemento a fila, no entanto se a fila estiver vazia ele retorna uma exception

        // Nao podemos alterar elemento do meio da lista trabalhando com fila, mas sim sempre o primeiro
        String clienteASerAtendido= filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for(String client : filaBanco){
            System.out.println(client);

        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("----->" + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());


    }
}
