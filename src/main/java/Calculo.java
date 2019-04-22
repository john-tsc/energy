public class Calculo {
    static final int MIL = 1000;
    static final int MES = 30;

    private double kWHora = 0.0;
    private double consumoPorDia = 0.0;
    private double consumoPorMes = 0.0;

    Equipamento equipamento = new Equipamento();

    public Calculo() {
    }

    public double cconsumoPorHora(double potencia, int hora) {
        //consumo em W/h.
        double consumoWH = calculoConsumo(potencia, hora);

        //transformando em KW//h
        this.kWHora = consumoWH / MIL;
        return this.kWHora;
    }

    public double calculoConsumoDia(double potencia, int hora, int quantidadeDia) {
        //consumo em W/h.
        double consumoWH = calculoConsumo(potencia, hora);

        //consumo em Wh/dia
        this.consumoPorDia = consumoWH * quantidadeDia;
        return this.consumoPorDia;
    }

    public double calculoConsumoMes(double potencia, int hora, int quantidadeMes) {
        //consumo em W/h.
        double consumoWH = calculoConsumo(potencia, hora);

        //consumo por mês em Wh/mês
        this.consumoPorMes = consumoWH + (MES * quantidadeMes);
        return this.consumoPorMes;
    }

    //método que calcula o consumo por hora e devolve em Wh
    private double calculoConsumo(double pontencia, int hora) {
        double consumo = pontencia * hora;
        return consumo;
    }
}