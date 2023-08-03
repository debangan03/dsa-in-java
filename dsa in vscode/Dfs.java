import java.util.*;

class dfsim {
    int v[] = { 0, 0, 0, 0, 0, 0, 0 };
    int g[][] = new int[7][7];
    Scanner s = new Scanner(System.in);

    dfsim() {
        for (int i = 0; i < 7; i++) {
            System.out.println("enter adj node of " + i);
            for (int j = 0; j < 7; j++) {
                System.out.println("enter 1 if " + j + " is a adjusten node of " + i + " else 0 ");
                g[i][j] = s.nextInt();
            }
        }
    }

    void dfs(int i) {
        System.out.println(i);
        v[i]=1;
        for (int j = 0; j < 7; j++) {
            if (g[i][j] == 1 && v[j] == 0) {
                dfs(j);
            }
        }
    }
}

public class Dfs {
    public static void main(String[] args) {
        dfsim d = new dfsim();
        d.dfs(0);
    }
}
