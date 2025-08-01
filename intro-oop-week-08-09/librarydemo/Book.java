package deneme4;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title,String author,double price){
        this.author=author;
        this.price=price;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Invalid balance amount");
        }else{
            this.price = price;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
