public class Equipamento {
    private String nome, categoria;
    private int id;
    private double consumo; //Em watts

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getConsumo(){
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
