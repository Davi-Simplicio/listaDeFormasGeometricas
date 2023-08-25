public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        this.adicionaForma();
    }

    @Override
    public double calculoArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calculoPerimetro() {
        return lado * 4;
    }


    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                "} " + super.toString();
    }
}
