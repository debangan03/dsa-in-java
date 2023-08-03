public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println("--------------------------------------------------");
        s.pop();
        s.display();
    }
}