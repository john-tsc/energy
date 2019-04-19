public class Calculo {
    static final int MIL = 1000;

    Equipamento equipamento = new Equipamento();

    public double calculoHora(double potencia, int hora) {
        //consumo em W/h.
        double consumo = potencia * hora;

        //transformando em KW//h
        double kWHora = consumo / MIL;
        return kWHora;
    }

}