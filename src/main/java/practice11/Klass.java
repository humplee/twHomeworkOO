package practice11;

import java.util.ArrayList;

public class Klass {
    int number;
    Student leader;
    //String name;
    private ArrayList<Student> savedStudentList;
    private ArrayList<Teacher> savedTeacherList;
    Klass(int klass){
        this.number=klass;
        savedStudentList=new ArrayList<>();
        savedTeacherList=new ArrayList<>();
            }

    public int getNumber() {
        return number;
    }
    public void addStudent(Student student){
        if(savedTeacherList.size()>0){
            for(int i=0;i<savedTeacherList.size();i++){
                savedTeacherList.get(i).sayStudentAfterAdded(student,this);
            }
        }
        savedStudentList.add(student);
    }
    public void addTeacher(Teacher Teacher){savedTeacherList.add(Teacher);}

    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(Student leader){
        if(savedTeacherList.size()>0){
            for(int i=0;i<savedTeacherList.size();i++){
                savedTeacherList.get(i).sayLeaderAfterAdded(leader,this);
            }
        }
        if(savedStudentList.isEmpty()||(!savedStudentList.contains(leader))){
            System.out.print("It is not one of us.\n");
            return;}
        this.leader=leader;}

    public Student getLeader() {

        return leader;
    }
    public void appendMember(Student theStudent){
        if(savedTeacherList.size()>0){
            for(int i=0;i<savedTeacherList.size();i++){
                savedTeacherList.get(i).sayStudentAfterAdded(theStudent,this);
            }
        }
        savedStudentList.add(theStudent);
    }
    boolean isIn(Student theStudent){
        return (savedStudentList.contains(theStudent));
    }
}
