package practice03;

public class Student extends Person {
    int klass;
    Student(String name, int age, int klass) {
        super(name, age);
        this.klass=klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return ("I am a Student. I am at Class "+klass+".");
    }

}
