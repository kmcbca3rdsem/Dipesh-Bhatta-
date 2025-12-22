class Book {
    String title;
    String author;
    double price;

    void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = " Programming";
        b.author = "Sandesh";
        b.price = 150;

        b.applyDiscount(10);
        b.display();
    }
}
