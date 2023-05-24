package linearDataStructure.dynamicDataStructure.queue.utils;

public interface QueueInterface<T> {

    public void enqueue(T elemento);
    public T dequeue() throws Exception;
    public int size();
    public T firstItem();
    public boolean isEmpty();

}
