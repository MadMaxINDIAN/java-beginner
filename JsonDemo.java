// Demonstrates handling JSON in Java using Jackson
// You need jackson-databind JAR in your classpath to run this example
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

class Student {
    public String name;
    public int age;
    public Student() {} // Default constructor needed for Jackson
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonDemo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Java object to JSON
        Student student = new Student("Alice", 22);
        String jsonString = mapper.writeValueAsString(student);
        System.out.println("Java object to JSON: " + jsonString);
        // JSON to Java object
        String inputJson = "{\"name\":\"Bob\",\"age\":25}";
        Student student2 = mapper.readValue(inputJson, Student.class);
        System.out.println("JSON to Java object: " + student2.name + ", age: " + student2.age);
    }
}
