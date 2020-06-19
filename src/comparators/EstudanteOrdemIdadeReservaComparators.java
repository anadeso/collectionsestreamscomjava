package comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReservaComparators implements Comparator<Estudante> {

    // Comparator = Usado para usar na classe externa da minha classe de dominio, e nao em minha principal que é a Estudante
    // Comparator = Recebemos dois parametros e sera feito a compracao entre elas
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
