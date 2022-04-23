import java.util.Scanner;

public class Forces {
    final static int VECTOR_SIZE = 3;

    public static String solution(int [][] forces){
        int resultant[] = {0,0,0};
        for(int i = 0; i < forces.length; i++){
            for(int j = 0; j < VECTOR_SIZE; j++){
                resultant[j] += forces[i][j];
            }
        }
        for(int i = 0; i < VECTOR_SIZE; i++){
            if(resultant[i] != 0){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[][] forces = new int[length][VECTOR_SIZE];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < 3; j++){
                forces[i][j] = s.nextInt();
            }
        }
        System.out.println(solution(forces));
    }
}
