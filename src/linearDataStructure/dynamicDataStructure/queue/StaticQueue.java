package linearDataStructure.dynamicDataStructure.queue;

import linearDataStructure.dynamicDataStructure.queue.utils.QueueInterface;

public class StaticQueue<T> implements QueueInterface<T>{
    private T[] elements;
    private int size;
    int end, start;
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
    public StaticQueue(int tamanho){
        elements = (T[]) new Object[tamanho];
        size = 0;
        start = 0;
        end =  - 1;
    }

    @Override
    public void enqueue(T elemento){
        if(isFull()){
            System.out.println("Lista Cheia");
        }
        /**
         * atribui a end o valor verificando se end + 1 é msm tamanho que o vetor elements
         * se for verdadeiro a pilha esta cheia e retorna a 0. 
         * tambem poderia ser implementado da seguinte forma end = (end + 1) % elements.length;
         * end recebe o resto da divisão entre end + 1 5(tamanho do vetor)
         * e modulo de um numero por outro é sempre o dividendo, a menos que sejam iguais, o resto é 0
         */
        end = (end + 1 == elements.length) ? 0 : end + 1; 
        elements[end] = elemento;
        size++;
    }

    @Override
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Pilha Vazia");
        }
        T e  = elements[start];
        start++;
        size--;
        return e;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public T firstItem(){
        return elements[start];
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == elements.length;
    }
}
