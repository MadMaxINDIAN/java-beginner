// Demonstrates interfaces in Java
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
