package model;

public class Plano {
    private String nome;
    private double preco;

    public Plano(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static final Plano MENSAL = new Plano("Mensal", 90.0);
    public static final Plano SEMESTRAL = new Plano("Semestral", 480.0);
    public static final Plano ANUAL = new Plano("Anual", 900.0);

    public void exibirPlano() {
        System.out.println("Plano: " + nome);
        System.out.println("Preço: R$ " + preco);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
