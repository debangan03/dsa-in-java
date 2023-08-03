
public class Main {
    public static void main(String[] args) {
        IMPLEMENTATION  tree = new IMPLEMENTATION();
        IMPLEMENTATION.Tree1 t;
        t  = tree.create();
        tree.inorder(t);
        System.out.println("");
        tree.preorder(t);
        System.out.println("");
        tree.postorder(t);
    }
}