public abstract class Conta {
    // Agência e número de conta são
    // definidos em sua crição e não podem
    // ser modificadas a partir disso
    private int numero;
    private int agencia;

    // Banco em que esta Conta está inscrita
    private Banco banco;

    private double saldo = 0;

    Conta(Banco banco, int numero, int agencia) {
        this.banco = banco;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }
}