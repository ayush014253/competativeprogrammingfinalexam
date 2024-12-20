import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class Problem_A_Dominoes_2 {
    
    
    private static int dfs(int[][] grid, int knock,int n) {
        // Create a stack for DFS
        int knockeddominos=0;

        for(int i=1;i<n+1;i++){
            if(grid[knock][i]==1){
                knockeddominos=knockeddominos+1+dfs(grid,i,n);
                //System.out.println("i: "+i+"Knock "+knock+"Knockeddominos: "+knockeddominos);
            }
                
        }
        return knockeddominos;
        
    }
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(reader.readLine());
            for(int k=0;k<t;k++){
                String[] line = reader.readLine().split(" ");
                int n =Integer.parseInt(line[0]);
                int m=Integer.parseInt(line[1]);
                int l=Integer.parseInt(line[2]);
                int[][] grid=new int[n+1][n+1];
                for(int i=0;i<m;i++){
                    String[] lines = reader.readLine().split(" ");
                    int x =Integer.parseInt(lines[0]);
                    int y=Integer.parseInt(lines[1]);
                    grid[x][y]=1;
                }
                int knockeddominos=0;
                for(int j=0;j<l;j++){
                    int knock=Integer.parseInt(reader.readLine());
                    
                    knockeddominos=knockeddominos+1+dfs(grid,knock,n);
                    
                }
                System.out.println(knockeddominos);
            }
        }
        catch (IOException e) {
            e.printStackTrace();  // Handle the exception
        }
     }
}
     
