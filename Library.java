/*
 * У этого класса должны быть методы для добавления книг и 
выдачи библиотечных карточек.
 */

import java.util.ArrayList;
import java.util.List;

public class Library<T, K, V> {
    private List<Book<T>> catalog;
    private int cardCounter;

    private List<LibraryCard<K, V>> list;

    public Library() {
        catalog = new ArrayList<>();
        // Список книг в библиотеке.
        list = new ArrayList<>();
        // Список библиотечных карточек в библиотеке.
        cardCounter = 0;
        // Количестко библиотечных карточек в библиотеке.
    }

    // Добавление книги в список книг.
    public void addBook(Book<T> book) {
        catalog.add(book);
    }

    // Добавление библиотечных карточек в список.
    public void displayLibraryCard(LibraryCard<K, V> libraryCard) {
        list.add(libraryCard);
        cardCounter++;
    }

    @Override
    public String toString() {
        return "Библиотечные карточки: \n" + list;
    }
}
