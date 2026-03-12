interface Printable {
    void print();
}

class Book implements Printable {
    public void print() {
        System.out.println("Printing book");
    }
}

public class InterfaceReference {
    public static void main(String[] args) {
        Printable p = new Book();
        p.print();
    }
}