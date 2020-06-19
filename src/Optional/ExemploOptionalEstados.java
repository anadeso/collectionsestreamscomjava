package Optional;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor optional que esta presente ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("nao esta presnte"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que nao eta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println(("Valor opcional que nao esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lanca erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = nao esta presente"));



    }
}
