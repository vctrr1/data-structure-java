package linearDataStructure.staticDataStructure.Vetor;

import java.util.Arrays;

public class Vector<T> {
    private T[] elements; 
    private int size;

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
        this.size = 0;
    }

    public void addEndVector(T e) throws Exception{
        if(size < elements.length){
            elements[size] = e;
            size++;
        }else{
            throw new Exception("Vetor Cheio");
        }
    }

    public void addStartOfVector(T e) throws Exception {
        if(size < elements.length){
            if(size == 0){
                elements[size] = e;
                size++;
            }else{
                for(int i = elements.length - 1; i > 0; i--){
                    elements[i] = elements[i - 1];
                }
                elements[0] = e;
                size++;
            }

        }else{
            throw new Exception("Vetor Cheio");
        }
    }

    public boolean addByIndex(T element, int index) throws Exception{
        if(index >= elements.length || index < 0){
            throw new Exception("Index invalido");
        }else if(index == 0){
            addStartOfVector(element);
            return true;
        }else if(index >= size){
            addEndVector(element);
            return true;
        }else {
            for(int i = size - 1; i >= index; i--){
                elements[i+1] = elements[i];
            }
            elements[index] = element;
            size++;
            return true;

        }
    }

    public T searchByIndex(int index) throws Exception {
        if(index > elements.length - 1 || index < 0){
            throw new Exception("Lista Vazia ou Index invalido");
        }
        T e = null;
        for(int i = 0; i < size; i++){
            if(i == index){
                e = elements[i];
            }
        }
        return e;
    }

    public boolean searchElement(T element){ // retorna true se o elemento estiver no vetor
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public T removeStart()throws Exception {
        T removeElement = elements[0];
        if(size == 0){
            throw new Exception("Vetor Vazio");
        }
        for(int i = 0; i < size - 1; i++){
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return removeElement;
    }

    public T removeEnd() throws Exception{
        T elementRemoved = elements[size-1];
        if(size == 0){
            throw new Exception("Lista Vazia");
        }
        elements[size - 1] = null;
        size --;
        return elementRemoved;
    }

    public T removeByIndex(int index) throws Exception{
        T elementRemoved = elements[index];
        if(index >= elements.length || index < 0){
            throw new Exception("Index invalido");
        }else if(index == 0){
            return removeStart(); // precisou do return pois o elementRemoved precisa ser inicialisado em todos os casos
        }else if(index >= size - 1){
            return removeEnd();
        }else{
            for(int i = index; i < size - 1; i++){
                elements[i] = elements[i+1];
            }
            elements[size - 1] = null;
            size--;
            return elementRemoved;
        }
    }

    @Override
    public String toString() {
        return "Vector -> Elementos=" + Arrays.toString(elements) + " Tamanho v = " + elements.length + " Tamanho e = " + size;
    }

}
