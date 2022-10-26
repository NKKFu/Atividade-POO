public class Predio extends Casa {
    private int andares;

    Predio(String endereco, double medidaLargura, double medidaComprimento, double medidaAltura, int andares) {
        super(endereco, medidaLargura, medidaComprimento, medidaAltura);
        this.andares = andares;
    }

    public int getAndares() {
        return andares;
    }
}