package nonLinearDataStructure.graph.utils;
public class Aresta<T> {
    private int peso;
    private Vertice<T> start;
    private Vertice<T> end;

    public Aresta(int peso, Vertice<T> start, Vertice<T> end){
        this.peso = peso;
        this.start = start;
        this.end = end;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public Vertice<T> getStart() {
        return start;
    }
    public void setStart(Vertice<T> start) {
        this.start = start;
    }
    public Vertice<T> getEnd() {
        return end;
    }
    public void setEnd(Vertice<T> end) {
        this.end = end;
    }
}
