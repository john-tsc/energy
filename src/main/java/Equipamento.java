public class Equipamento {
    private String nome;
    private int id;
    private double consumo; //Em watts


    public Equipamento() {
    }

    public Equipamento(String nome, int id, double consumo) {
        this.nome = nome;
        this.id = id;
        this.consumo = consumo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}