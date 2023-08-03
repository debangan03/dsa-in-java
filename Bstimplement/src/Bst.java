public class Bst {
    public class tree{
        int v;
        tree l,r;
        tree(int v1){
            v=v1;
            l=null;
            r=null;
        }
    }
    tree r=null;
    public tree insert(tree t,int v1){
        if (t == null) {
            t=new tree(v1);


        }
    }
}
