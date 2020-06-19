import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {

        // Cria a coleaco de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona estudantes para a colecao
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de eementos do stream
        System.out.println("Contagem: " +estudantes.stream().count());

        // Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras " +estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras " +estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: " +estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova colecao, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nva colecao com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da colecao
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console, e depois retorna a mesma colecao
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra colecao
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra w no nome
        System.out.println("Todos os elementos tem W no nome? " +estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elemento com a minuscula no nome
        System.out.println("Tem algum elemento com a minuscula no nome? " +estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da colecao, se existir no console
        System.out.print("Retorna o primeiro elemento da colecao: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operacao encadeada
        System.out.println("Operacao encadeada: ");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
            .peek(System.out::println)
            .filter((estudante) ->
                     estudante.toLowerCase().contains("r"))
            .collect((Collectors.toList())));
            //.collect(Collectors.joining(", "));
            //.collect(Collectors.toSet()));
            //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
    }
}
