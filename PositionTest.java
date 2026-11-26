import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PositionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] position = s.split("");
        int x = 0;
        int y = 0;        

        Set<String> direction = new HashSet<>();  
        direction.add(x + " " + y);     
        for(int i= 0; i < n; i++){
            if("R".equals(position[i])){
                x += 1;
            }
            if("L".equals(position[i])){
                x -= 1;
            }
            if("U".equals(position[i])){
                y += 1;
            }
            if("D".equals(position[i])){
                y -= 1;
            }
            direction.add(x + " " + y);  
        }      
        if(direction.size() != n + 1){
            System.out.println("Yes");
            System.out.println(direction.size());
        } else {
            System.out.println("NO");
        }
    }    
}