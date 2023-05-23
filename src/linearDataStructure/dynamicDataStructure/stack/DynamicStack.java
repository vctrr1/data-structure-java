package linearDataStructure.dynamicDataStructure.stack;

import linearDataStructure.dynamicDataStructure.stack.inteface.StackInterface;

public class DynamicStack<T> implements StackInterface<T>{

    private Node<T> top;
    private int lenght;

    public DynamicStack(){
        this.top = null;
        this.lenght = 0;
    }
    @Override
    public void push(T element) throws Exception {
        Node<T> newN = new Node<>();
        newN.setElement(element);
        newN.setNext(top);
        top = newN;
        lenght++;
    }

    @Override
    public T pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha Vazia"); 
        }
        T e = top.getElement();
        top = top.getNext();
        lenght--;
        return e;
    }

    @Override
    public T top() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha Vazia");
        }
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return lenght == 0;
    }
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }
    @Override
    public String toString() {
        return "DynamicStack Topo = " + top + ", Topo da Pilha = Elemento " + top.getElement();
    }

}
