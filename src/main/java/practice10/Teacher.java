package practice10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<Klass> klass;
    Teacher(int id,String name, int age, LinkedList<Klass> theList) {
        super(id,name, age);
        this.klass=new LinkedList<>(theList);
    }
    Teacher(int id,String name, int age) {
        super(id,name, age);
    }

//    public Klass getKlass() {
//        return klass;
//    }
    public LinkedList<Klass> getClasses() {
        return klass;
    }


    @Override
    public String introduce() {

        if(klass!=null&&klass.size()>0){
            String buffer=String.valueOf(klass.get(0).number);
            for(int i=1;i<klass.size();++i){
            buffer=buffer+", "+String.valueOf(klass.get(i).number);
        }
            return super.introduce()+" I am a Teacher. I teach Class "+buffer+".";
        }

        else return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(klass.contains(student.klass))return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        else return super.introduce()+" I am a Teacher. I don't teach "+student.name+".";
    }
    public boolean isTeaching(Student student){
        if(klass.size()<1)return false;
        for(int i=0;i<klass.size();i++){
            if(klass.get(i).isIn(student))return true;
        }
        return false;
    }




}
