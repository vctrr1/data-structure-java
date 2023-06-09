package nonLinearDataStructure.graph.utils;
import java.util.ArrayList;

public class Vertice<T> {
    private T data;
    private ArrayList<Aresta<T>> arestasEntrada;
    private ArrayList<Aresta<T>> arestasSaida;

    public Vertice(T data){
        this.data = data;
        this.arestasEntrada = new ArrayList<>();
        this.arestasSaida = new ArrayList<>();
    }

    public void addArestaEntrada(Aresta<T> aresta){
        this.arestasEntrada.add(aresta);
    }

    public void addArestaSaida(Aresta<T> aresta){
        this.arestasSaida.add(aresta);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
