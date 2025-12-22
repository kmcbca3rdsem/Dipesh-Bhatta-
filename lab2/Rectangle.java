class Rectangle {
    double length;
    double width;
    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
    void calculatePerimeter() {
        System.out.println("Perimeter: " + 2 * (length + width));
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;
        r.calculateArea();
        r.calculatePerimeter();
    }
}
