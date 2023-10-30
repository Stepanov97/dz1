import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person0 = new Person("Vanya", 20);
        Person person1 = new Person("Vanya", 20);
        Person person2 = new Person("Tolya", 22);
        Person person3 = new Person("Lana", 19);
        Person person4 = new Person("Vika", 21);
        Person person5 = new Person("Tanya", 18);
        Person person6 = new Person("Alex", 19);
        Person person7 = new Person("Viktor", 23);
        Person person8 = new Person("Vika", 21);
        List<Person> list = List.of(person0, person1, person2, person3, person4,person5,person6,person7,person8);
        System.out.println(list);
        Collection newList = checkItOut(list);
        System.out.println(newList);
    }
    public static <T> Collection<T> checkItOut(Collection<T> coll) {
        return new HashSet<>(coll);
    }
}