package practice07;

public class Teacher extends Person {
    Klass klass;
    Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }
    Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(klass!=null)return super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        else return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(student.klass.getNumber()==klass.getNumber())return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        else return super.introduce()+" I am a Teacher. I don't teach "+student.name+".";
    }




}
