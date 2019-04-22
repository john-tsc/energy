public class Calculo {
    static final int MIL = 1000;
    static final int MES = 30;
    static final int ANO = 365;

    private double kWHora = 0.0;
    private double consumoPorDia = 0.0;
    private double consumoPorMes = 0.0;
    private double consumoPorAno = 0.0;

    Equipamento equipamento = new Equipamento();

    public Calculo(double kWHora, double consumoPorDia, double consumoPorMes, double consumoPorAno, Equipamento equipamento) {

        this.kWHora = kWHora;
        this.consumoPorDia = consumoPorDia;
        this.consumoPorMes = consumoPorMes;
        this.consumoPorAno = consumoPorAno;
        this.equipamento = equipamento;
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

    public double calculoConsumoPorAno(double potencia, int hora, int quantidadeAno) {
        double consumoWH = calculoConsumo(potencia, hora);

        //consumo por ano em Wh
        this.consumoPorAno = consumoWH + (ANO * quantidadeAno);
        return this.consumoPorAno;
    }


    //método que calcula o consumo por hora e devolve em Wh
    private double calculoConsumo(double pontencia, int hora) {
        double consumo = pontencia * hora;
        return consumo;
    }
}