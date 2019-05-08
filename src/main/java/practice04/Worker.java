package practice04;

public class Worker extends Person {
    Worker(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        return "My name is "+name+". I am "+String.valueOf(age)+" years old."+" I am a Worker. I have a job.";
    }
}
