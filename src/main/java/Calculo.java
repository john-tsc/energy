public class Calculo {
    static final int MIL = 1000;

    private double kWHora = 0.0;

    Equipamento equipamento = new Equipamento();

    public double calculoHora(double potencia, int hora) {
        //consumo em W/h.
        double consumo = potencia * hora;

        //transformando em KW//h
        this.kWHora = consumo / MIL;
        return this.kWHora;
    }


}