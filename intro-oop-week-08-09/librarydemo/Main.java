package deneme4;

public class Main {
    public static void main(String[] args) {
        Book b=new Book("I robot","Isaac Asimov",258.25);
        b.setPrice(-5);
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
        System.out.println(b.getTitle());
    }
}
