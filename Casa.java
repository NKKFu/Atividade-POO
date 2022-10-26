public class Casa {
    private String endereco;
    private double medidaLargura, medidaComprimento, medidaAltura;

    Casa(String endereco, double medidaLargura, double medidaComprimento, double medidaAltura) {
        this.endereco = endereco;
        this.medidaLargura = medidaLargura;
        this.medidaComprimento = medidaComprimento;
        this.medidaAltura = medidaAltura;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getMedidaLargura() {
        return medidaLargura;
    }

    public double getMedidaComprimento() {
        return medidaComprimento;
    }

    public double getMedidaAltura() {
        return medidaAltura;
    }
}