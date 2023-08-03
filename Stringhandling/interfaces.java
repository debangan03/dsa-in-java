
interface interf {
public void run();
    
}
class interfs implements interf{
    public void run(){
        System.out.println("running");
    }
}
public class interfaces{
    public static void main(String[] args) {
        interfs i = new interfs();
    i.run();
    }
    
}