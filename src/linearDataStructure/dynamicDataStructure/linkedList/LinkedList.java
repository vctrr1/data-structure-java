package linearDataStructure.dynamicDataStructure.linkedList;
import linearDataStructure.dynamicDataStructure.stack.utils.Node;

public class LinkedList<T> {
    
    private Node<T> head, tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addTail(T element){
        Node<T> newN = new Node<>();
        newN.setElement(element);
        if(isEmpty()){
            head = newN;
            tail = newN;
            size++;
        }else{
            tail.setNext(newN);
            tail = newN;
            size++;
        }
    }

    public void addHead(T element){
        Node<T> newN = new Node<>();
        newN.setElement(element);
        if(isEmpty()){
            head = newN;
            tail = newN;
        }else{
            newN.setNext(head);
            head = newN;
            size++;
        }
    }

    public void addAtIndex(T element, int index) throws Exception {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("indice Invalido.");
        }else if(index == 0){ //inserir no inicio da lista, head()
            addHead(element);
            size++;
        }else if(index == size){ //inserir final da lista, tail()
            addTail(element);
            size++;
        }else{
            Node<T> newN = new Node<T>(element); //cria novo No
            Node<T> current = head; //variavel para percorrer na lista
            for(int i = 0; i < index - 1; i++){ //percorre ate uma posição a menos index - 1
                current = current.getNext(); // current para uma casa antes 
            }

            newN.setNext(current.getNext()); // novo no vai apontar para a proxima casa do current 
            current.setNext(newN); // current que parou uma casa antes vai apontar para o novo no
            size++;
        }
    }

    public T removeTail() throws Exception {
        T removeElement;
        
        if(isEmpty()){
            throw new Exception("Lista Vazia");
        }else if(head == tail){ //lista com apenas 1 elemento
            removeElement = head.getElement();
            head = null;
            tail = null;
            size --;
        }else{ // lista com mais de 1 elemento
            Node<T> current = new Node<>();
            current = head;
    
            while(current.getNext() != tail){
                current = current.getNext();
            }
            removeElement = tail.getElement();
            tail = current;
            tail.setNext(null);
            size--;
        }
        return removeElement;
    }

    public T removeHead() throws Exception {
        T removedElement;
        if(isEmpty()){
            throw new Exception("Lista Vazia");
        }else if(head == tail){// lista com apenas 1 elemento
            removedElement = head.getElement();
            head = null;
            tail = null;
            size--;
        }else{
            removedElement = head.getElement();
            head = head.getNext();
            size--;
        }
        return removedElement;
    }

    public T removeAtIndex(int index) throws Exception {
        T removedElement;
        if(isEmpty()){
            throw new Exception("Fila Vazia");
        }else if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Posição Invalida");
        }else if(index == 0){ // remover inicio da lista head()
            removedElement = head.getElement();
            removeHead();
            size--;
        }else if(index == size - 1){ //remover final da lista()
            removedElement = tail.getElement();
            removeTail();
            size--;
        }else{//lista com mais de um elemento e index n é na head ou tail
            Node<T> current = head; //variavel para percorrer na lista
            for(int i = 0; i < index - 1; i++){ // percorre ate uma casa anterior a escolhida
                current = current.getNext(); //current index - 1
            }
            removedElement = current.getNext().getElement(); // atribui a removedElement o valor o proximo do current(index)valor a ser retirado
            current.setNext(current.getNext().getNext());//como current parou uma casa antes do index, usa-se o setProximo para apontar 
            size--;                                      //para duas casa afrente pq a proxima sera retirada
        }
        return removedElement;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio = " + head + "]";
    }
}
