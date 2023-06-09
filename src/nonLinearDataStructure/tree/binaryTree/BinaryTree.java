package nonLinearDataStructure.tree.binaryTree;

import java.util.ArrayList;

import nonLinearDataStructure.tree.utils.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size = 0;

    public BinaryTree(){
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
                        size++;
                        break;
                    }
                }else {
                    if(current.getRight() != null){
                        current = current.getRight();
                    }else {
                        current.setRight(newElement);
                        size++;
                        break;
                    }
                }
            }
        }
        return;
    }

    public void removeElement(T element) {
        root = remove(root, element);
    }
    
    private Node<T> remove(Node<T> current, T element) {
        if (current == null) {
            return null;
        }
        int compareResult = element.compareTo(current.getElement());
        if (compareResult < 0) {
            current.setLeft(remove(current.getLeft(), element));
        } else if (compareResult > 0) {
            current.setRight(remove(current.getRight(), element));
        } else {
            //Elemento encontrado
            if (current.getLeft() == null && current.getRight() == null) {
                // Caso 1: O nó é uma folha, basta removê-lo
                size--;
                return null;
            } else if (current.getLeft() == null) {
                // Caso 2: O nó tem apenas um filho direito, substitua-o pelo filho direito
                size--;
                return current.getRight();
            } else if (current.getRight() == null) {
                // Caso 2: O nó tem apenas um filho esquerdo, substitua-o pelo filho esquerdo
                size--;
                return current.getLeft();
            } else {
                // Caso 3: O nó tem filhos à esquerda e à direita
                // Encontre o elemento mínimo na subárvore direita (ou o elemento máximo na subárvore esquerda)
                // e substitua o nó atual por esse elemento
                Node<T> minNode = findMinimumNode(current.getRight());
                current.setElement(minNode.getElement());
                // Remover o nó mínimo da subárvore direita
                current.setRight(remove(current.getRight(), minNode.getElement()));
            }
        }
    
        return current;
    }
    
    private Node<T> findMinimumNode(Node<T> node) {
        if (node.getLeft() == null) {
            return node;
        }
        return findMinimumNode(node.getLeft());
    }
    

    public ArrayList<T> inOrder(Node<T> node) {
        ArrayList<T> result = new ArrayList<>();
        inOrderTraversal(node, result);
        return result;
    }
    
    private void inOrderTraversal(Node<T> node, ArrayList<T> result) { //O sufixo "Traversal" é frequentemente usado para indicar que o método é responsável por percorrer a estrutura de dados, visitando cada nó de acordo com uma determinada ordem.
        if (node != null) {
            inOrderTraversal(node.getLeft(), result);
            result.add(node.getElement());
            inOrderTraversal(node.getRight(), result);
        }
    }

    public ArrayList<T> preOrder(Node<T> node) {
        ArrayList<T> result = new ArrayList<>();
        preOrderTraversal(node, result);
        return result;
    }
    
    private void preOrderTraversal(Node<T> node, ArrayList<T> result) { //O sufixo "Traversal" é frequentemente usado para indicar que o método é responsável por percorrer a estrutura de dados, visitando cada nó de acordo com uma determinada ordem.
        if (node != null) {
            result.add(node.getElement());
            preOrderTraversal(node.getLeft(), result);
            preOrderTraversal(node.getRight(), result);
        }
    }

    public ArrayList<T> posOrder(Node<T> node) {
        ArrayList<T> result = new ArrayList<>();
        posOrderTraversal(node, result);
        return result;
    }
    
    private void posOrderTraversal(Node<T> node, ArrayList<T> result) { //O sufixo "Traversal" é frequentemente usado para indicar que o método é responsável por percorrer a estrutura de dados, visitando cada nó de acordo com uma determinada ordem.
        if (node != null) {
            posOrderTraversal(node.getLeft(), result);
            posOrderTraversal(node.getRight(), result);
            result.add(node.getElement());
        }
    }

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "Tree [root=" + root + "]";
    }

}
