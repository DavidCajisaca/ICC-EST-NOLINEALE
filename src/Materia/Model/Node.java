package Materia.Model;

public class Node {
    private int value;
    private Node izquierda;
    private Node derecha;

    public Node(int value) {
        this.value = value;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return izquierda;
    }

    public Node getRight() {
        return derecha;
    }

    public void setLeft(Node izquierda) {
        this.izquierda = izquierda;
    }

    public void setRight(Node derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
    
}
