class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
    }
}