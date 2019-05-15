package practice08;

public class Klass {
    int number;
    Student leader;
    //String name;
    Klass(int klass){
        this.number=klass;
            }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(Student leader){this.leader=leader;}

    public Student getLeader() {
        return leader;
    }
}
