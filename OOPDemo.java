// Demonstrates basic OOP in Java
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}
public class OOPDemo {
    public static void main(String[] args) {
        Person p = new Person("Bob", 30);
        p.introduce();
    }
}
