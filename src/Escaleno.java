public class Escaleno extends Triangulo {

    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.adicionaForma();
    }

    @Override
    public double calculoArea() {
        double semiperimetro = calculoPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }


    @Override
    public String toString() {
        return "Escaleno{} " + super.toString();
    }
}
