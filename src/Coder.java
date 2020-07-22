import java.util.*;

public class Coder {
    public static void main(String[] args) {
        int A[] = {55, 40, 71, 59, 48, 40, 75, 46, 71, 72, 58, 76 , 46, 42, 63, 54, 34, 46, 72, 43, 65, 70, 51, 70};
        Arrays.sort(A);
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(A.length);
    }
}
