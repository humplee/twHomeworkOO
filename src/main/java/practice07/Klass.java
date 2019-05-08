package practice07;

public class Klass {
    int number;
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
}
