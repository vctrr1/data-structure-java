import linearDataStructure.dynamicDataStructure.stack.DynamicStack;
import linearDataStructure.dynamicDataStructure.stack.StaticStack;

public class App {
    public static void main(String[] args) throws Exception {

        StaticStack<String> s = new StaticStack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println("Saiu: " + s.pop());
        System.out.println(s.top());

        DynamicStack<Integer> ds = new DynamicStack<>();
        ds.push(4);
        ds.push(5);
        System.out.println("Saiu: " + ds.pop());
        System.out.println(ds.top());
        
    }
}
