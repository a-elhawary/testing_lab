import java.util.Scanner;

public class Watermelon {
    public static String solution(int weight){
        if(weight % 2 == 0 && weight != 2){
            return "YES";
        }else{
            return "NO";
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        System.out.println(solution(weight));
    }
}
