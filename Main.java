/*
 * Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T 
 * для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. 
Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и 
выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
 */

public class Main {

    public static void main(String[] args) {
        Library<String, Integer, String> library = new Library<>();

        // Добавление экземпляров книг.
        library.addBook(new Book<>("Cat", "Bubnov A.S."));
        library.addBook(new Book<>("Dog", "Vaskin D.F."));
        library.addBook(new Book<>("With Love", "Melko N.M."));
        library.addBook(new Book<>("Aravia", "Baranova F.N."));
        // Book<String> book1 = new Book<>("Cat", "Bubnov A.S.");
        // Book<String> book2 = new Book<>("Dog", "Vaskin D.F.");
        // Book<String> book3 = new Book<>("With Love", "Melko N.M.");
        // Book<String> book4 = new Book<>("Aravia", "Baranova F.N.");

        // Создание экземпляров библиотечных карточек.
        LibraryCard<Integer, String> libraryCard1 = new LibraryCard<>(001, "Книга о кошках.");
        LibraryCard<Integer, String> libraryCard2 = new LibraryCard<>(002, "Книга о собаках.");
        LibraryCard<Integer, String> libraryCard3 = new LibraryCard<>(003, "Книга о любви.");
        LibraryCard<Integer, String> libraryCard4 = new LibraryCard<>(004, "Книга о косметике.");

        // Добавление библиотечных карточек на вывод.
        libraryCard1.setNumberCard(002);
        libraryCard2.setNumberCard(001);
        libraryCard3.setNumberCard(003);
        libraryCard4.setInfoBook("Книга о косметике.");

        // Вывод библиотченых карточек книг, которые были выданы.
        library.displayLibraryCard(libraryCard1);
        library.displayLibraryCard(libraryCard2);
        library.displayLibraryCard(libraryCard3);
        library.displayLibraryCard(libraryCard4);

        System.out.println(library);

    }
}
