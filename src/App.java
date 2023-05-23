import linearDataStructure.dynamicDataStructure.queue.StaticQueue;
import linearDataStructure.dynamicDataStructure.stack.DynamicStack;
import linearDataStructure.dynamicDataStructure.stack.StaticStack;

public class App {
    public static void main(String[] args) throws Exception {

        StaticStack<String> s = new StaticStack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println("Saiu: " + s.pop());
        System.out.println(s);

        System.out.println("-------------------------------------------------");

        DynamicStack<Integer> ds = new DynamicStack<>();
        ds.push(1);
        ds.push(2);

        System.out.println("Saiu: " + ds.pop());
        System.out.println(ds.top());
        System.out.println("Saiu: " + ds.pop());

        System.out.println("-------------------------------------------------");

        StaticQueue<Integer> st = new StaticQueue<>(5);
        st.enqueue(1);
        st.enqueue(2);
        st.enqueue(3);
        st.enqueue(4);

        System.out.println("Saiu: " + st.dequeue());

        System.out.println("Proximo: " + st.firstItem());

    }
}
