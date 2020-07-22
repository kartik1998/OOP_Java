package Exception_Handling;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Dividing by zero isn't Possible");
        }
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("String is null");
        }finally{
            // Finally block is always executed
            System.out.println("Program Ends!");
        }
    }
}
