package Interfaces;

import java.util.ArrayList;

public class Student_Log implements ISaveable{
    ArrayList<Pair> studentInfo = new ArrayList<>();

    @Override
    public void populateList(String studentName,int rollNumber) {
        studentInfo.add(new Pair(studentName,rollNumber));
    }

    @Override
    public ArrayList<Pair> returnList() {
        return studentInfo;
    }
}
