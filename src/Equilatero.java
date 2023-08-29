public class Equilatero extends Triangulo {

    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.adicionaForma();


    }

    @Override
    public double calculoArea() {
        return Math.sqrt(3) / 4 * Math.pow(lado1, 2);
    }

    @Override
    public String toString() {
        return "Equilatero\n" + super.toString();
    }
}
