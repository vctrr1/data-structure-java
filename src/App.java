import java.util.ArrayList;

import linearDataStructure.dynamicDataStructure.linkedList.LinkedList;
import linearDataStructure.dynamicDataStructure.queue.DynamicQueue;
import linearDataStructure.dynamicDataStructure.queue.StaticQueue;
import linearDataStructure.dynamicDataStructure.stack.DynamicStack;
import linearDataStructure.dynamicDataStructure.stack.StaticStack;
import linearDataStructure.staticDataStructure.Vetor.Vector;
import nonLinearDataStructure.tree.binaryTree.BinaryTree;

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
        ds.push(3);

        System.out.println("Saiu: " + ds.pop());
        System.out.println(ds);
        ds.pop();
        System.out.println(ds);
        System.out.println("-------------------------------------------------");

        StaticQueue<Integer> st = new StaticQueue<>(5);
        st.enqueue(1);
        st.enqueue(2);
        st.enqueue(3);
        st.enqueue(4);

        System.out.println("Saiu: " + st.dequeue());
        System.out.println("Proximo: " + st.firstItem());

        System.out.println("-------------------------------------------------");

        DynamicQueue<Integer> dq = new DynamicQueue<>();

        dq.enqueue(1);
        dq.enqueue(2);
        dq.enqueue(3);
        dq.enqueue(4);

        System.out.println( "Primeiro Elemento: " + dq.firstItem());
        System.out.println("Saiu: " + dq.dequeue());
        System.out.println(dq);

        System.out.println("-------------------------------------------------");

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addTail(1);
        ll.addTail(2);
        ll.addTail(3);
        ll.addTail(4);

        System.out.println(ll.removeTail());
        ll.addHead(5);
        System.out.println(ll);
        ll.addAtIndex(51, 3);
        System.out.println(ll);
        ll.removeAtIndex(1);
        System.out.println(ll);

        System.out.println("-------------------------------------------------");

        Vector<Integer> v = new Vector<>(10); 
        v.addEndVector(1);
        v.addEndVector(2);
        v.addEndVector(3);
        v.addEndVector(4);
        v.addEndVector(5);
        System.out.println(v);
        v.addStartOfVector(22);
        System.out.println(v);
        System.out.println(v.searchByIndex(0));
        System.out.println(v.searchElement(1));
        System.out.println(v.removeStart());
        System.out.println(v.addByIndex(55, 8) ? "Conseguiu" : "N conseguiu");
        System.out.println(v);
        System.out.println(v.removeByIndex(2));
        System.out.println(v);
        System.out.println(v.removeByIndex(2));
        System.out.println(v);
        System.out.println(v.removeByIndex(3));
        System.out.println(v);

        System.out.println("-------------------------------------------------");
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        t.addElement(10);
        t.addElement(8);
        t.addElement(5);
        t.addElement(9);
        t.addElement(7);
        t.addElement(18);
        t.addElement(13);
        t.addElement(20);
        ArrayList<Integer> inOrderList = t.inOrder(t.getRoot());
        System.out.println(inOrderList);
        System.out.println(t);
    }
}
