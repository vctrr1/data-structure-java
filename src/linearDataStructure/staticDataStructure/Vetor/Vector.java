package linearDataStructure.staticDataStructure.Vetor;

public class Vector<T> {
    private T[] elements; 
    private int lenght;

        /**
     * @SuppressWarnings("unchecked") pq tem um warning no cast de T para Objetc.
     * Essa situação ocorre porque os arrays em Java são covariantes, o que significa 
     * que você pode atribuir um array de um tipo a uma variável de array de um tipo 
     * supertipo. Por exemplo, você pode atribuir um array de Object a uma variável 
     * de array de String. No entanto, isso pode levar a problemas se você inserir 
     * elementos do tipo errado no array. No entanto, é importante ter cuidado ao 
     * manipular o array após o cast, garantindo que você esteja trabalhando com 
     * elementos do tipo correto para evitar erros de tempo de execução relacionados 
     * aos tipos.
     */
    @SuppressWarnings("unchecked")
    public Vector(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.lenght = 0;
    }

    public void addEndVector(T e) throws Exception{
        if(this.lenght < this.elements.length){
            this.elements[this.lenght] = e;
            this.lenght++;
        }else{
            throw new Exception("Vetor Cheio");
        }
    }

    public void addStartOfVector(T e) throws Exception {
        
    }
    
}
