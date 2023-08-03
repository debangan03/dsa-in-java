import java.util.Scanner;

public class IMPLEMENTATION {
    Scanner sc = new Scanner(System.in);
    public class Tree1{
        int v;
        Tree1 l,r;
    }
    public Tree1 create(){
        int x;
        System.out.println("enter node value");
        x = sc.nextInt();
        Tree1 nn = new Tree1();
        nn.v= x;
        if(x==-1){
            return null;
        }
        System.out.println("enter left node value or -1 to stop");
        nn.l = create();
        System.out.println("enter right node value or -1 to stop");
        nn.r=create();
        return nn;

    }
    public void inorder(Tree1 t){
        if(t==null){
            return;
        }
       inorder(t.l);
        System.out.print(t.v+"\t");
        inorder(t.r);
    }
    public void preorder(Tree1 t){
        if(t==null){
            return;
        }
        System.out.print(t.v+"\t");
        preorder(t.l);
        preorder(t.r);
    }
    public void postorder(Tree1 t){
        if(t==null){
            return;
        }
        postorder(t.l);
        postorder(t.r);
        System.out.print(t.v+"\t");
    }

}
