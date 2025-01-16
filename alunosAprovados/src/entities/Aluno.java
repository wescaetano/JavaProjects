package entities;

public class Aluno {
    private String nome;
    private double p1;
    private double p2;

    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
}
