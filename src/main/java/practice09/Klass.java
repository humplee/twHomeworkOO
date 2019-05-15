package practice09;

import java.util.ArrayList;

public class Klass {
    int number;
    Student leader;
    //String name;
    ArrayList<Student> savedStudentList;
    Klass(int klass){
        this.number=klass;
        savedStudentList=new ArrayList<>();
            }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(Student leader){
        if(savedStudentList.isEmpty()&&(!savedStudentList.contains(leader))){
            System.out.print("It is not one of us.\n");
            return;}
        this.leader=leader;}

    public Student getLeader() {

        return leader;
    }
    public void appendMember(Student theStudent){
        savedStudentList.add(theStudent);
    }
}
