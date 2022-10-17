public class Main {

    public static final Book[] book = new Book[4];

    public static void getBook() {
        for (Book book : book) {
            System.out.println("Книга: " + book.getName() + ", Автор: " + book.getAuthor());
        }
    }



    public static void main(String[] args) {

        book[0] = new Book("Страна Чудес", "А.Б. Глушаков");
        book[1] = new Book("Приключения вокруг света", "В.Г. Искаев");
        book[2] = new Book("Альматер", "З.И. Ярушев");
        book[3] = new Book("Зазеркальне", "Н.Н. Лодырев");
        getBook();
        // Задача вариант 5




    }
}