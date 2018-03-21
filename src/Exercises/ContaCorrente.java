package Exercises;

public class ContaCorrente {

    double saldo;

    public double saldo() {
        return saldo;
    }

    public double deposita(double quantidade) {
        return saldo = quantidade + saldo;
    }

    public double saca(double quantidade) {
        return saldo = saldo - quantidade;
    }

}
