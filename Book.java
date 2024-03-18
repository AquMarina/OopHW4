/*
 * Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T 
 * для ее названия.
 */
public class Book<T> {
    private T name;
    private String author;
    private LibraryCard<Integer, String> libraryCard;
    private Boolean isPlace;

    public Book(T name, String author, LibraryCard<Integer, String> libraryCard, Boolean isPlace) {
        this.name = name;
        this.author = author;
        this.libraryCard = libraryCard;
        this.isPlace = isPlace;
    }

    public Book(T name, String author, LibraryCard<Integer, String> libraryCard) {
        this(name, author, libraryCard, true);
    }

    public T getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public LibraryCard<Integer, String> getLibraryCard() {
        return libraryCard;
    }

    public void setIsPlace() {
        this.isPlace = false;
    }

    public Boolean getIsPlace() {
        return isPlace;
    }

    @Override
    public String toString() {
        return "Название книги: " + name + ", Автор: " + author + "\nБиблиотечная карточка книги: " + libraryCard;
    }

}
