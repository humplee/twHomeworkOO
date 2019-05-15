package practice09;

//import java.util.concurrent.ConcurrentHashMap;


public class Person {
    String name;
    int age;
    int id;
    //private static AtomicReference<Person> aRperson;
    //static Map<Integer, Person> cache = new ConcurrentHashMap<>();
    Person(int id,String name, int age){
        this.name=name;
        this.age=age;
        this.id=id;
       // cache.computeIfPresent(id,(existingPerson,newPerson)-> this);
       // aRperson.getAndSet(new Person(id,name,age));

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id == other.id;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String introduce(){
        return ("My name is "+name+". I am "+String.valueOf(age)+" years old.");
    }

//    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor){
//        Map<Object, Boolean> map = new ConcurrentHashMap<>();
//        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
//    }

}
