import Materia.Controller.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(17);
        tree.insert(76);
         tree.insert(9);
        tree.insert(23);
        tree.insert(54);
         tree.insert(14);
        tree.insert(19);
        tree.imprimirPre();
        System.out.println("\n In order ");
        tree.imprimirIn();
        System.out.println("\n Post order ");
        tree.imprimirPost();
    }
}
