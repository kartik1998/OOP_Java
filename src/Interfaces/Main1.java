package Interfaces;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Student_Log student_log = new Student_Log();
        student_log.populateList("Kartik",38);
        student_log.populateList("Aman",8);
        student_log.populateList("Ankita",13);
        student_log.populateList("Akshat",9);
        student_log.populateList("laiba",42);
        ArrayList<Pair> A = student_log.returnList();
        for(Pair p:A){
            System.out.println(p.x+" "+p.y);
        }
    }
}
