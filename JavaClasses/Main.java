package mainTask;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> book = BooksLibrary.MyBooks;

        String author = "George Orwell"; // задаём автора "George Orwell", "Stephen King", "John Ronald Reuel Tolkien"
        String publi = "Scribner"; // задаём издательство "Allen & Unwin", "Scribner", "Secker and Warburg"
        int years = 1950; // задаём год с которого нас интересуют издания.

        System.out.println("список книг заданного автора: ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getAuthors().equals(author)) {
                System.out.println(book.get(i).getNameOfTheBook());
            }
        }

        System.out.println("---------------------------");
        System.out.println("список книг, выпущенных заданным издательством: ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getPublisher().equals(publi)) {
                System.out.println(book.get(i).getNameOfTheBook());
            }
        }

        System.out.println("---------------------------");

        System.out.println("список книг, выпущенных после заданного года ВКЛЮЧИТЕЛЬНО.");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getYearOfPublishing() >= years) {
                System.out.println(book.get(i).getNameOfTheBook());
            }
        }
    }
}
