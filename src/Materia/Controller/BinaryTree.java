package Materia.Controller;

import Materia.Model.Node;

public class BinaryTree {
private Node root;

    public BinaryTree() {
    this.root = null;
    }
    public void insert(int value) {
        root = insertRec(root, value);
    }
    private Node insertRec (Node padre,int value){
        if (padre == null) {
            
            return new Node(value);
        }
        if (value < padre.getValue()) {
            padre.setLeft(insertRec(padre.getLeft(), value));
        } else {
            padre.setRight(insertRec(padre.getRight(), value));
        }
        return padre;
    }
    public void imprimirPre() {
        imprimirRecpre(root);
    }
    private void imprimirRecpre(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValue() + " ");
            imprimirRecpre(nodo.getLeft());
            
            imprimirRecpre(nodo.getRight());
        }
    }
    public void imprimirIn() {
        imprimirRecin(root);
    }
    private void imprimirRecin(Node nodo) {
        if (nodo != null) {
            imprimirRecin(nodo.getLeft());
            System.out.print(nodo.getValue() + " ");
            imprimirRecin(nodo.getRight());
        }
    }
    public void imprimirPost() {
        imprimirRecpost(root);
    }
    private void imprimirRecpost(Node nodo) {
        if (nodo != null) {
            imprimirRecpost(nodo.getLeft());
            imprimirRecpost(nodo.getRight());
            System.out.print(nodo.getValue() + " ");
        }
    }
    public boolean findValue(int value) {
    return findValueRec(root, value);
}
private boolean findValueRec(Node nodo, int value) {
    if (nodo == null) {
        return false; 
    }
    if (nodo.getValue() == value) {
        return true;
    }
    if (value < nodo.getValue()) {
        return findValueRec(nodo.getLeft(), value);
    } else {
        return findValueRec(nodo.getRight(), value);
    }
}
}
