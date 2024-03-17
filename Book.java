/*
 * Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T 
 * для ее названия.
 */
public class Book<T> {
    private T name;
    private String author;

    public Book(T name, String author) {
        this.name = name;
        this.author = author;
    }

    public T getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Название книги: " + name + " Автор: " + author;
    }

}
