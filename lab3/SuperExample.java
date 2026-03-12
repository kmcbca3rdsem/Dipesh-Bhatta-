class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor called");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
    }
}