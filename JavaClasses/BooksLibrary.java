package mainTask;

import java.util.ArrayList;

public class BooksLibrary {

   public static Book NineteenEightyFour = new Book(
            1,
            "1984",
            "George Orwell",
            "Secker and Warburg",
            1949,
            375,
            9.55,
            "Hard cover" );
    public static Book AnimalFarm = new Book(
            2,
            "Animal Farm",
            "George Orwell",
            "Secker and Warburg",
            1945,
            215,
            7.30,
            "Stapling" );
    public static Book FullDarkNoStars = new Book(
            3,
            "Full Dark, No Stars",
            "Stephen King",
            "Scribner",
            2010,
            368,
            10.60,
            "Hard cover" );
    public static Book TheBazaarOfBadDreams = new Book(
            4,
            "The Bazaar of Bad Dreams",
            "Stephen King",
            "Scribner",
            2015,
            495,
            12.80,
            "Hard cover" );
    public static Book TheHobbit = new Book(
            5,
            "The Hobbit",
            "John Ronald Reuel Tolkien",
            "Allen & Unwin",
            1937,
            310,
            7.19,
            "Stapling" );
    public static Book TheLordOfTheRings = new Book(
            6,
            "The Lord of the Rings",
            "John Ronald Reuel Tolkien",
            "Allen & Unwin",
            1954,
            362,
            12.40,
            "Hard cover" );

    public  static ArrayList<Book> MyBooks = new ArrayList<Book>(){{add(NineteenEightyFour);
    add(AnimalFarm);
    add(FullDarkNoStars);
    add(TheBazaarOfBadDreams);
    add(TheHobbit);
    add(TheLordOfTheRings);
    }};
}
