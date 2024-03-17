/*
 * Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. 
Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
 */
public class LibraryCard<K, V> {
    private K numberCard;
    private V infoBook;

    public LibraryCard(K numberCard, V infoBook) {
        this.numberCard = numberCard;
        this.infoBook = infoBook;
    }

    public V getInfoBook() {
        return infoBook;
    }

    public K getNumberCard() {
        return numberCard;
    }

    public void setInfoBook(V infoBook) {
        this.infoBook = infoBook;
    }

    public void setNumberCard(K numberCard) {
        this.numberCard = numberCard;
    }

    @Override
    public String toString() {
        return "{Номер карточки: " + numberCard + ", информация о книге: " + infoBook + "}";
    }
}
