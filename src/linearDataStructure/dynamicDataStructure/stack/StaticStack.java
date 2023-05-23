package linearDataStructure.dynamicDataStructure.stack;

import java.util.Arrays;

import linearDataStructure.dynamicDataStructure.stack.inteface.StackInterface;

public class StaticStack<T> implements StackInterface<T>{

    private T[] elements;
    private int top;

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
    public StaticStack(){
        elements = (T[]) new Object[10];
        top = -1; //invalid position vet elements
    }

    @Override
    public void push(T e) throws Exception {
        if(isFull()){
            throw new Exception("Pinha Cheia");
        }
        top++;
        elements[top] = e;
    }

    @Override
    public T pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha Vazia");
        }
        T e = elements[top];
        elements[top] = null; //set null pq vai ser tirado
        top--;
        return e;
    }

    @Override
    public T top() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha Vazia");
        }
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == elements.length -1;
    }

    @Override
    public String toString() {
        return "StaticStack -> Elementos = " + Arrays.toString(elements) + ", Topo da Pilha = Casa " + (top + 1);
    }
    
}
