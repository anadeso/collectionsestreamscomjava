package Optional;

import javax.swing.text.html.Option;
import javax.swing.text.html.StyleSheet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(Optional.empty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao esta presente"));

        if (optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println(valor);

        }

        optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);

    }
}
