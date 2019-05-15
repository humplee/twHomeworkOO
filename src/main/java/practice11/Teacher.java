package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<Klass> klass;
    Teacher(int id,String name, int age, LinkedList<Klass> theList) {
        super(id,name, age);
        this.klass=new LinkedList<>(theList);
        if(theList.size() > 0){
            for(int i=0;i<theList.size();i++){
                //addKlass(theList.get(i));
                theList.get(i).addTeacher(this);
            }
        }
    }
    Teacher(int id,String name, int age) {
        super(id,name, age);
    }
//    public void addKlass(Klass theKlass){
//        klass.add(theKlass);
//        System.out.println("klass added");
//        theKlass.addTeacher(this);
//    }
    public void sayStudentAfterAdded(Student student,Klass klass){
        System.out.print("I am "+name+". I know "+student.name+" has joined Class "+klass.number+".\n");
    }
    public void sayLeaderAfterAdded(Student student,Klass klass){
        System.out.print("I am "+name+". I know "+student.name+" become Leader of Class "+klass.number+".\n");
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
