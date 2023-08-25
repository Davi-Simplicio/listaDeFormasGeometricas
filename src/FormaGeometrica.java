import java.util.ArrayList;

public abstract class FormaGeometrica {

    private static ArrayList<FormaGeometrica> listaFormas = new ArrayList<>();

    public static ArrayList<FormaGeometrica> getListaFormas() {
        return listaFormas;
    }

    public abstract double calculoArea();

    public abstract double calculoPerimetro();

    public void adicionaForma() {
        listaFormas.add(this);
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "area=" + calculoArea() +
                ", perimetro=" + calculoPerimetro() +
                '}';
    }

}
