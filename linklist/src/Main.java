public class Main extends LL {
    public static void main(String[] args) {
        LL l = new LL();
        l.addfirst(1);
        l.addfirst(2);
        l.addfirst(3);
        l.addnode(44);
        l.addnode(33);
        l.addpos(22,2);
        l.disp();
        System.out.println("-------------------------------------------------------------------------");
        l.deletebeg();
        System.out.println("--------------------------------------------");
        l.deleteend();
        System.out.println("--------------------------------------------");
        l.disp();
        System.out.println("--------------------------------------------");
        l.deletepos(2);
        System.out.println("--------------------------------------------");
        l.disp();
    }
}