import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Professor logado = new Professor("", "");


    public static void main(String[] args) {
        login();
    }

    private static void login() {
        int cont = 0;
        Professor professor = new Professor("123", "Davi Simplicio");
        Professor.professores.add(professor);
        do {
            System.out.println("Qual sua senha?");
            String senha = sc.next();
            logado = Professor.testaSenha(senha);

            if (logado != null) {
                menu();
            } else {
                System.out.println("Senha Errada");
                cont++;
            }
        } while (cont < 3);
    }

    private static void menu() {
        int opcao;
        do {
            System.out.println("""
                    [1]Cadastrar forma Geométrica
                    [2]Listar formas Geométricas
                    [3]Logout""");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    break;
            }
        } while (opcao != 3);
    }

    private static void listar() {
        int opcao;
        do {
            System.out.println("""
                    [1]listar circulo
                    [2]listar quadrado
                    [3]listar retangulo
                    [4]listar triangulo
                    [5]listar tudo
                    [6]sair""");
            opcao = sc.nextInt();
            for (FormaGeometrica forma : FormaGeometrica.getListaFormas()) {
                switch (opcao) {
                    case 1:
                        if (forma instanceof Circulo) {
                            System.out.println(forma);
                        }
                        break;
                    case 2:
                        if (forma instanceof Quadrado) {
                            System.out.println(forma);
                        }
                        break;
                    case 3:
                        if (forma instanceof Retangulo) {
                            System.out.println(forma);
                        }
                        break;
                    case 4:
                        if (forma instanceof Triangulo) {
                            System.out.println(forma);
                        }
                        break;
                    case 5:
                        System.out.println(forma);
                        break;
                    case 6:
                        break;
                }
            }
        } while (opcao != 6);
    }


    private static void cadastrar() {
        int opcao;
        do {
            System.out.println("""
                    [1]Circulo
                    [2]Quadrado
                    [3]Retangulo
                    [4]Triangulo
                    [5]Sair""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCirculo();
                    break;
                case 2:
                    cadastrarQuadrado();
                    break;
                case 3:
                    cadastrarRetangulo();
                    break;
                case 4:
                    cadastrarTriangulo();
                    break;
                case 5:
                    break;
            }

        } while (opcao != 5);
    }

    private static void cadastrarCirculo() {
        double raio;
        System.out.println("Qual o comprimento do raio");
        raio = sc.nextDouble();
        Circulo circulo = new Circulo(raio);
    }

    public static void cadastrarQuadrado() {
        double lado;
        System.out.println("Qual o tamnho do lado");
        lado = sc.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
    }

    public static void cadastrarTriangulo() {
        double lado1, lado2, lado3;

        System.out.println("Qual a medida do lado 1?");
        lado1 = sc.nextDouble();
        System.out.println("Qual a medida do lado 2?");
        lado2 = sc.nextDouble();
        System.out.println("Qual a medida do lado 3?");
        lado3 = sc.nextDouble();
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Isto não é um trinagulo");
        } else {
            logado.defineTriangulo(lado1, lado2, lado3);
        }
    }

    public static void cadastrarRetangulo() {
        double comprimento, largura;
        System.out.println("Qual o comprimento do retangulo?");
        comprimento = sc.nextDouble();
        System.out.println("qual a largura do retangulo?");
        largura = sc.nextDouble();
        if (comprimento == largura || comprimento <= 0 || largura <= 0) {
            System.out.println("Isto não é um triângulo");
        } else {
            Retangulo retangulo = new Retangulo(comprimento, largura);
        }
    }
}
