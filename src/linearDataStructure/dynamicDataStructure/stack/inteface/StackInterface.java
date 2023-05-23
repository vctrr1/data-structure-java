package linearDataStructure.dynamicDataStructure.stack.inteface;

public interface StackInterface<T> {

    public void push(T element) throws Exception;
	public T pop() throws Exception;
	public T top() throws Exception;
	public boolean isEmpty();
	public boolean isFull();

}
