package practice11;

public class Student extends Person {
    //int klass;
    Klass klass;
    Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass=klass;
        klass.addStudent(this);
    }

    public Klass getKlass() {
        return klass;
    }


    @Override
    public String introduce() {
        if(klass.leader==null)return super.introduce()+" I am a Student. I am at Class "+klass.number+".";
        if(klass.leader.name.equals(name))return super.introduce()+" I am a Student. I am Leader of Class "+klass.number+".";
        return super.introduce()+" I am a Student. I am at Class "+klass.number+".";
    }

}
