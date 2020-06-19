package comparators;

public class Estudante implements Comparable<Estudante>{

    // Comparable = Ordenar o objeto que estamos olhando
    // Comparable = recebe apenas um argumento, logo assumimos que implementaremos dentro de uma classe de dominio
    // Comparemos o atributo atual da classe versus o que recceberemos por parametro

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + "-" + idade;
    }

    // 1
    // -1
    @Override
    public int compareTo(Estudante o) {
        return this.idade - o.getIdade();
    }
}
