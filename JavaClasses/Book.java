package mainTask;

public class Book {


    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private String bindingType;

    public Book(int id, String name, String authors, String publisher, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void getName(String nameOfTheBook) {
        this.name = nameOfTheBook;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +'\n'+
                ", name='" + name + '\'' + '\n'+
                ", authors='" + authors + '\'' +'\n'+
                ", publisher='" + publisher + '\'' +'\n'+
                ", yearOfPublishing=" + yearOfPublishing +'\n'+
                ", numberOfPages=" + numberOfPages +'\n'+
                ", price=" + price +'\n'+
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}