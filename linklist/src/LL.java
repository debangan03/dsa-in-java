public class LL {
        Node head;
    public class Node {
        int d;
        Node next;
        Node(int a){
            this.d = a;
            this.next = null;
        }
    }
    public void addnode(int d1){
        Node n = new Node(d1);
        if(head == null){
            head = n;
        }
        else{
            Node t = head;
            while(t.next!= null){
                t= t.next;
            }
            t.next=n;
        }
    }
    public void addfirst(int d1){
        Node nnode  = new Node(d1);
        nnode.next = head;
        head = nnode;
    }
    public void addpos(int d1,int p){
        Node n = new Node(d1);
        Node t = head;
            Node p1;
        for (int i = 0;i<p;i++)
        {
            t=t.next;
        }
        n.next=t.next;
        t.next=n;
    }
    public void deletebeg(){
        Node k;
        k = head;
        head = head.next;
        k = null;
    }
    public void deleteend(){
        Node k =  head;
        while(k.next.next!=null){
            k = k.next;
        }
        k.next=null;
    }
    public void deletepos(int p1){
        Node t  = head;
        Node k;
        for(int i=0;i<p1;i++){
            t = t.next;
        }
        k = t.next;
        t.next = k.next;
        k=null;
    }
    public void disp(){
        Node t = head;
        while(t!=null){
            System.out.println(t.d);
            t= t.next;
        }
    }
}
