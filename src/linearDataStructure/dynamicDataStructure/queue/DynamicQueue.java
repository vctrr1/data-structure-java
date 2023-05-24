package linearDataStructure.dynamicDataStructure.queue;
import java.io.EOFException;

import linearDataStructure.dynamicDataStructure.queue.utils.QueueInterface;
import linearDataStructure.dynamicDataStructure.stack.utils.Node;

//implementing queue with Linked List

public class DynamicQueue<T> implements QueueInterface<T> {

    private Node<T> start, end;
    private int size;

    public DynamicQueue(){
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {
        Node<T> newN = new Node<>();
        newN.setElement(element);
        if(isEmpty()){
            start = newN;
            end = newN;
        }
        end.setNext(newN);
        end = newN;
        size++;
    }

    @Override
    public T dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Fila Vazia");
        }
        T removedItem = start.getElement();
        start = start.getNext();
        size--;
        if (isEmpty()) {
            end = null; // se a fila ficar fazia end = null;
        }
        return removedItem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T firstItem() {
        return start.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "DynamicQueue | Inicio da Fila = " + start + " Tamanho da Fila = " + size;
    }
    
    

}
