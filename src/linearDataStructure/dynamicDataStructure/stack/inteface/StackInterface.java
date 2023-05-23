package linearDataStructure.dynamicDataStructure.stack.inteface;

public interface StackInterface {

    public void push(int element) throws Exception;
	public int pop() throws Exception;
	public int top() throws Exception;
	public boolean isEmpty();
	public boolean isFull();

}
