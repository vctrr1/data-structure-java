package nonLinearDataStructure.tree.binaryTree;

import nonLinearDataStructure.tree.utils.Node;

public class Tree<T extends Comparable<T>> {
    Node<T> root;

    public Tree(){
        this.root = null;
    }

    public void addElement(T element){
        Node<T> newElement = new Node<T>(element);
        if(root == null){
            this.root = newElement;
            return;
        }else{
            Node<T> current = this.root;
            while(true){
                if(newElement.getElement().compareTo(current.getElement()) == -1){
                    if(current.getLeft() != null){
                        current = current.getLeft();
                    }else{
                        current.setLeft(newElement);
                        break;
                    }
                }else {
                    if(current.getRight() != null){
                        current = current.getRight();
                    }else {
                        current.setRight(newElement);
                        break;
                    }
                }
            }
        }
        return;
    }
}
