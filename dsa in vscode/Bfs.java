import java.util.*;

class q {
    ArrayList<Integer> a = new ArrayList<>();

    public void enq(int x) {
        a.add(x);
    }

    public int deq() {
        int k = a.get(0);
        a.remove(0);
        return k;
    }

    public boolean ise() {
        return a.isEmpty();
    }

}


public class Bfs {
    static int v[] = {0,0,0,0,0,0,0};
    static int g[][] = new int[7][7];
    public static void dfs(int i) {
        System.out.println(i);
        v[i]=1;
        for (int j = 0; j < 7; j++) {
            if (g[i][j] == 1 && v[j] == 0) {
                dfs(j);
            }
        }
    }
    public static void main(String[] args) {
        q q = new q();
        
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 7; i++) {
            System.out.println("enter adj node of " + i);
            for (int j = 0; j < 7; j++) {
                System.out.println("enter 1 if " + j + " is a adjacent node of " + i + " else 0 ");
                g[i][j] = sc.nextInt();
            }
        }
        int i=0;
        System.out.println(i);
        v[i]=1;
        q.enq(i);
        while(!q.ise()){
            int key  =q.deq();
            for (int j = 0; j < 7; j++) {
                if(g[key][j]==1&&v[j]==0){
                System.out.println(j);
                v[j]=1;
                q.enq(j);
                }
                
            }
        }
        System.out.println("dfs ------------");
        v= new int[] {0,0,0,0,0,0,0};
        dfs(0);

    }
}