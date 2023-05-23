package linearDataStructure.dynamicDataStructure.stack;

import linearDataStructure.dynamicDataStructure.stack.inteface.StackInterface;

public class StaticStack implements StackInterface{

    int[] elements;
    int top;

    public StaticStack(){
        elements = new int[10];
        top = -1; //invalid position vet elements
    }

    @Override
    public void push(int e) throws Exception {
        if(isFull()){
            throw new Exception("Pinha Cheia");
        }
        top++;
        elements[top] = e;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Pilha Vazia");
        }
        int e = elements[top];
        top--;
        return e;
    }

    @Override
    public int top() throws Exception {
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
    
}
