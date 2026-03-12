class Test {
    public int a = 10;
    protected int b = 20;
    int c = 30;

    void display() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class AccessControlDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}