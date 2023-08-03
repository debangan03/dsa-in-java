class Stackimplement {



    Node head;
    public class Node{
        int d;
        Node next;
        Node(int d1){
            this.d= d1;
            this.next = null;
        }

    }
    public void push(int d1){
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
    public void pop(){
        Node k =  head;
        while(k.next.next!=null){
            k = k.next;
        }
        k.next=null;
    }
    public void display(){
        Node t = head;
        while(t!=null){
            System.out.println(t.d);
            t= t.next;
        }
    }
}
public class Stack {
    public static void main(String[] args) {

        Stackimplement s = new Stackimplement();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("-----------------------After Push-----------------------");
        s.display();
        System.out.println("-----------------------After Pop--------------------------");
        s.pop();
        s.display();
    }
}