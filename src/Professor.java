import java.util.ArrayList;

public class Professor {
    public static ArrayList<Professor> professores = new ArrayList<>();
    private String senha;
    private String nomeCompleto;


    public Professor(String senha, String nomeCompleto) {
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
    }

    public static Professor testaSenha(String senha) {
        for (Professor profE : professores) {
            if (senha.equals(profE.senha)) {
                return profE;
            }
        }
        return null;
    }

    public void defineTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            Equilatero equilatero = new Equilatero(lado1, lado2, lado3);
        } else if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1 || lado3 == lado1 && lado1 != lado2) {
            Isosceles isosceles = new Isosceles(lado1, lado2, lado3);
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            Escaleno escaleno = new Escaleno(lado1, lado2, lado3);
        }
    }
}
