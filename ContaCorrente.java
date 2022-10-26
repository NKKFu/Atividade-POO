public class ContaCorrente extends Conta {
    ContaCorrente(Banco banco, int numero, int agencia) {
        super(banco, numero, agencia);
    }

    public double getTaxaManutencao() {
        return getBanco().getTaxaManutencao();
    }

    public double cobrarManutencao() {
        double rendimento = getSaldo() * getTaxaManutencao() / 100;
        retirar(rendimento);
        return rendimento;
    }
}