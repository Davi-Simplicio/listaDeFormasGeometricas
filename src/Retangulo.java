public class Retangulo extends FormaGeometrica {
    private double comprimento, largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.adicionaForma();
    }

    @Override
    public double calculoArea() {
        return comprimento * largura;
    }

    @Override
    public double calculoPerimetro() {
        return 2 * (comprimento + largura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "comprimento=" + comprimento +
                ", largura=" + largura +
                "} " + super.toString();
    }
}
