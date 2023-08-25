public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.adicionaForma();
    }

    @Override
    public double calculoArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    @Override
    public double calculoPerimetro() {
        return 3.14 * (raio * 2);
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "diametro=" + raio * 2 +
                "} " + super.toString();
    }
}
