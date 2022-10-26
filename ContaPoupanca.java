public class ContaPoupanca extends Conta {
    ContaPoupanca(Banco banco, int numero, int agencia) {
        super(banco, numero, agencia);
    }

    public double getTaxaRendimento() {
        return getBanco().getTaxaRendimento();
    }

    public double gerarRendimento() {
        double rendimento = getSaldo() * getTaxaRendimento() / 100;
        depositar(rendimento);
        return rendimento;
    }
}