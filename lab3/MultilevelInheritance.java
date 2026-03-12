class Person {
    void display() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I manage the company");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
        m.work();
        m.manage();
    }
}