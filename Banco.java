import java.util.LinkedList;

class Banco {
    private double taxaManutencao;
    private double taxaRendimento;

    private LinkedList<ContaCorrente> contasCorrente = new LinkedList<ContaCorrente>();
    private LinkedList<ContaPoupanca> contasPoupanca = new LinkedList<ContaPoupanca>();

    Banco(double taxaManutencao, double taxaRendimento) {
        this.taxaManutencao = taxaManutencao;
        this.taxaRendimento = taxaRendimento;
    }

    public static void main(String[] args) {
        Banco bancoDoBrasil = new Banco(5, 3);

        ContaCorrente contaCarlos = bancoDoBrasil.criarContaCorrente(1, 1);
        contaCarlos.depositar(1000);
        contaCarlos.retirar(500);

        ContaPoupanca contaAllan = bancoDoBrasil.criarContaPoupanca(2, 1);
        contaAllan.depositar(1500);
        contaAllan.retirar(10);

        Conta conta = contaCarlos;
        conta.depositar(300);
        conta = contaAllan;
        conta.depositar(300);

        // Print de saldos
        System.out.println("Saldo conta de Allan = R$ " + contaAllan.getSaldo());
        System.out.println("Saldo conta de Carlos = R$ " + contaCarlos.getSaldo());
    }

    public ContaCorrente criarContaCorrente(int numero, int agencia) {
        ContaCorrente novaContaCorrente = new ContaCorrente(this, numero, agencia);
        contasCorrente.add(novaContaCorrente);
        return novaContaCorrente;
    }

    public ContaPoupanca criarContaPoupanca(int numero, int agencia) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(this, numero, agencia);
        contasPoupanca.add(contaPoupanca);
        return contaPoupanca;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}