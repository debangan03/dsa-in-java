public class Queue {



     Node f =null,r = null;
    public class Node{
        int d;
        Node next;
        Node(int d1){
            this.d= d1;
            this.next = null;
        }

    }
    public void enque(int v){
        Node n = new Node(v);
        if (f==null && r ==null){
            f = r = n;
        }
        else{
            r.next = n;
            r= n;
        }


    }
    public void deque(){

        if(f==null&&r ==null){
            System.out.println("queue is empty");
        }
        else{
            Node t;
            t=f;

            f = f.next;
            System.out.println("Deque element  : "+t.d);
            t =null;
        }
    }
    public void display()
    {
        Node n=f;
        while (n!=r){
            System.out.print(n.d+"->");
            n=n.next;
        }
        System.out.println(n.d);

    }
}
