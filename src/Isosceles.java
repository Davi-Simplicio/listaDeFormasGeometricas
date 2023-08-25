public class Isosceles extends Triangulo {
    private double ladoDiferente, ladoIgual;

    public Isosceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.adicionaForma();
    }

    public static double defineLadoDiferente(double lado1, double lado2, double lado3) {
        double ladoDiferente = 0;
        if (lado1 == lado2 && lado2 != lado3) {
            ladoDiferente = lado3;
        } else if (lado2 == lado3 && lado2 != lado1) {
            ladoDiferente = lado1;
        } else if (lado3 == lado1 && lado1 != lado2) {
            ladoDiferente = lado2;
        }
        return ladoDiferente;
    }

    @Override
    public double calculoArea() {
        ladoDiferente = defineLadoDiferente(lado1, lado2, lado3);
        if (lado1 == ladoDiferente || lado3 == ladoDiferente) {
            ladoIgual = lado2;
        } else if (lado2 == ladoDiferente) {
            ladoIgual = lado1;
        }
        double altura = Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(ladoDiferente, 2) / 4);
        return (ladoDiferente * altura) / 2;
    }

    @Override
    public String toString() {
        return "Isosceles{} " + super.toString();
    }
}
